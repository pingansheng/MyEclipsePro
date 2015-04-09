package com.hibernate.test;

import static org.junit.Assert.*;

import javax.xml.registry.infomodel.User;

import org.junit.Test;

import com.hibernate.domain.Users;
import com.hibernate.view.UserCURD;

public class testTools {

	@Test
	public void test() {
		UserCURD.query(100);
		UserCURD.addUser();
		UserCURD.updateUser(123);
		Users user=UserCURD.getUser(123);
		assertTrue(user.getUsername().equals("pingansheng"));
	}

}
