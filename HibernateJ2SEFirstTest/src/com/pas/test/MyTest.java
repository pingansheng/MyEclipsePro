package com.pas.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pas.domain.Users;
import com.pas.view.UserCURD;
public class MyTest {

	@Test
	public void testAddUser() {
		Users u=UserCURD.getUser(155);
		assertNotNull(u);
	}

}
