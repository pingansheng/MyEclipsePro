package com.pas.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleTest {
	public static void main(String[] args) {
		Locale[] locales = { new Locale("en", "US"), Locale.getDefault() };
		
		ResourceBundle resbd;
		for (Locale loc : locales) {

			resbd = ResourceBundle.getBundle("HelloFile", loc);

			System.out.println(resbd.getString("hello"));
		}

	}
}
