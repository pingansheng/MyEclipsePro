package com.pas.util;

import java.io.UnsupportedEncodingException;

public class MyTools {

	public static String getNewString(String old) throws UnsupportedEncodingException
	{
		return new String(old.getBytes("iso-8859-1"),"utf-8");
	}
}
