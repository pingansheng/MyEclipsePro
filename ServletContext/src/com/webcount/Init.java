package com.webcount;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.*;
import java.util.Properties;

public class Init extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		try {
			storeNum();
			System.out.println("**************************desstory");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		initPP();
	}

	private void initPP()
	{
		File ppf = new File(this.getServletContext().getRealPath("/")
				+ "/SiteInfo.properties");
		try {
			if (!ppf.exists()) {
				ppf.createNewFile();
				this.getServletContext().setAttribute("num", 0);
				storeNum();
			}
			else
			{
				this.getServletContext().setAttribute("num", getNum());
			}
			
			System.out.println("********��λ��ζ��");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private void storeNum() throws IOException {
		Properties pp=getPP();
		pp.setProperty("num", String.valueOf(this.getServletContext().getAttribute("num")));
		File ppf = new File(this.getServletContext().getRealPath("/")
				+ "/SiteInfo.properties");
		OutputStream os=new FileOutputStream(ppf);
		pp.store(os, "test");
		os.close();
	}
	
	private String getNum() throws IOException
	{
		Properties pp=getPP();
		return pp.getProperty("num").toString();
	}
	
	private Properties getPP() throws IOException
	{
		InputStream is=this.getServletContext().getResourceAsStream("SiteInfo.properties");
		Properties pp=new Properties();
		try {
			pp.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			is.close();
		}
		return pp;
	}
}
