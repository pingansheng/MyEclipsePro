package com.pas.service;

import com.inter.ChangLetter;

public class LowLetter implements ChangLetter {

	private String str;

	@Override
	public String change() {
		// ¥Û–¥-°∑–°–¥
		return str.toLowerCase();
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
