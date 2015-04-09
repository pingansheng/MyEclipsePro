package com.pas.i18n;

import java.util.Locale;

public class Test {
	public static void main(String [] args)
	{
		Locale[] locale=Locale.getAvailableLocales();
		
		for (Locale locale2 : locale) {
//			System.out.println(locale2.getCountry()+" : "+locale2.getDisplayCountry());
			System.out.println(locale2.getDisplayLanguage()+" : "+locale2.getLanguage());
		}
		
		
	}
}
