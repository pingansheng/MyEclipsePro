package com.pas.usermanager.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.sql.*;

public class SqlHelper {
	// �������
	private Connection ct = null;
	// ������������preparedstatement���statement
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	// �������ݿ�Ĳ���
	private static String url = "";
	private static String username = "";
	private static String driver = "";
	private static String passwd = "";

	private static CallableStatement cs = null;

	public static CallableStatement getCs() {
		return cs;
	}

	private static Properties pp = null;
	private static InputStream fis = null;
	// ����������ֻ��Ҫһ�Σ��þ�̬�����
	static {
		try {
			// ��dbinfo.properties
			pp = new Properties();
			//�������Ĭ����Ŀ¼SRC
			fis = SqlHelper.class.getClassLoader().getResourceAsStream(
					"dbInfo.properties");
			// fis = new FileInputStream();
			pp.load(fis);
			url = pp.getProperty("url");
			username = pp.getProperty("username");
			driver = pp.getProperty("driver");
			passwd = pp.getProperty("passwd");

			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			fis = null;// ��������վ����ʰ
		}

	}

	// �õ�����
	public Connection getConnection() {
		try {
			ct = DriverManager.getConnection(url, username, passwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ct;
	}

	// *************callPro1�洢���̺���1*************
	public  CallableStatement callPro1(String sql, String[] parameters) {
		try {
			ct = getConnection();
			cs = ct.prepareCall(sql);
			if (parameters != null) {
				for (int i = 0; i < parameters.length; i++) {
					cs.setObject(i + 1, parameters[i]);
				}
			}
			cs.execute();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} finally {
			close(rs, cs, ct);
		}
		return cs;
	}

	// *******************callpro2�洢����2************************
	public CallableStatement callPro2(String sql, String[] inparameters,
			Integer[] outparameters) {
		try {
			ct = getConnection();
			cs = ct.prepareCall(sql);
			if (inparameters != null) {
				for (int i = 0; i < inparameters.length; i++) {
					cs.setObject(i + 1, inparameters[i]);
				}
			}
			// cs.registerOutparameter(2,oracle.jdbc.OracleTypes.CURSOR);
			if (outparameters != null) {
				for (int i = 0; i < outparameters.length; i++) {
					cs.registerOutParameter(inparameters.length + 1 + i,
							outparameters[i]);
				}
			}
			cs.execute();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} finally {

		}
		return cs;
	}

	public ArrayList<Object> executeQuery(String sql, String[] parameters) {
		Connection ct = null;
		// ������������preparedstatement���statement
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ct = getConnection();
			ps = ct.prepareStatement(sql);
			if (parameters != null) {
				for (int i = 0; i < parameters.length; i++) {
					ps.setString(i + 1, parameters[i]);
				}
			}
			rs = ps.executeQuery();
			
			ArrayList<Object> al=new ArrayList<Object>();
			ResultSetMetaData rsmd=rs.getMetaData();
			int columncount=rsmd.getColumnCount();
			
			while(rs.next())
			{
				Object obs[]=new Object[columncount];
				for(int i=0;i<columncount;i++)
				{
					obs[i]=rs.getObject(i+1);
				}
				al.add(obs);
			}
			return al;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} finally {
			// �ر���Դ(�ȿ����)
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				rs = null;
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				ps = null;
			}
			if (null != ct) {
				try {
					ct.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				ct = null;
			}
		}
	}

	public  Connection getCt() {
		return ct;
	}

	public  PreparedStatement getPs() {
		return ps;
	}

	public  ResultSet getRs() {
		return rs;
	}

	public  void executeUpdate2(String[] sql, String[][] parameters) {
		try {
			ct = getConnection();
			ct.setAutoCommit(false);
			
			//���ø��뼶��
			//ct.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
			for (int i = 0; i < sql.length; i++) {

				if (null != parameters[i]) {
					ps = ct.prepareStatement(sql[i]);
					for (int j = 0; j < parameters[i].length; j++) {
						ps.setString(j + 1, parameters[i][j]);
					}
					ps.executeUpdate();
				}

			}

			ct.commit();

		} catch (Exception e) {
			e.printStackTrace();
			try {
				ct.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			close(rs, ps, ct);
		}

	}

	// ��дһ��update��delete��insert
	// sql��ʽ��update ���� set �ֶ��� =��where �ֶ�=��
	// parameter��Ӧ���ǣ���abc��,23��
	public  int executeUpdate(String sql, String[] parameters) {
		try {
			ct = getConnection();
			ps = ct.prepareStatement(sql);
			if (parameters != null) {
				for (int i = 0; i < parameters.length; i++) {
					ps.setString(i + 1, parameters[i]);
				}

			}
			return ps.executeUpdate();
		} catch (Exception e) {
			
			e.printStackTrace();// �����׶�
			// �׳��쳣
			// ���Դ���Ҳ���Բ�����
			throw new RuntimeException(e.getMessage());
		} finally {
			close(rs, ps, ct);
		}
	}

	public void close(ResultSet rs, Statement ps, Connection ct) {
		// �ر���Դ(�ȿ����)
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs = null;
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ps = null;
		}
		if (null != ct) {
			try {
				ct.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ct = null;
		}
	}
}
