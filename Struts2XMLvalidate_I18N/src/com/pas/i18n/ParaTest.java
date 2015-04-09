package com.pas.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ParaTest {
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();

		ResourceBundle resbd;
		resbd = ResourceBundle.getBundle("HelloFile", locale);
		String value=resbd.getString("hello");
		value=MessageFormat.format(value, "muhaha");
		System.out.println(value);
	}
}
