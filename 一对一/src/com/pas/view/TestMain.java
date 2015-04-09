package com.pas.view;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pas.domain.IDCard;
import com.pas.domain.Person;
import com.pas.util.HibernateSessionFactory;

public class TestMain {

	public static void main(String[] args) {
		add();
	}

	/**
	 * ���
	 * 
	 * @param hql
	 * @return
	 */
	private static void add() {
		Session session = null;
		Transaction trans = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();

			Person p1 = new Person();
			p1.setId(12341);
			p1.setName("˳ƽ");
			IDCard idCard = new IDCard();
			idCard.setId(19001);
			idCard.setValidateDate(new Date());

			idCard.setPerson(p1);// ��ʾidCard����������p1�������.
			
			session.save(p1);// �ȱ�����
			session.save(idCard);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trans != null) {
				trans.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				HibernateSessionFactory.closeSession();
			}
		}
	}

}
