package com.pas.domain;

import java.io.Serializable;
import java.util.Date;

public class IDCard implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Date validateDate;
	private Person person;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getValidateDate() {
		return validateDate;
	}
	public void setValidateDate(Date validateDate) {
		this.validateDate = validateDate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
