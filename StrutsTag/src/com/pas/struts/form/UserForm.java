/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.pas.struts.form;

import org.apache.struts.action.ActionForm;

/** 
 * MyEclipse Struts
 * Creation date: 10-08-2013
 * 
 * XDoclet definition:
 * @struts.form name="userForm"
 */
public class UserForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** age property */
	private Integer age;

	/** name property */
	private String name;

	private String fruit;
	/*
	 * Generated Methods
	 */

	/** 
	 * Returns the age.
	 * @return Integer
	 */
	public Integer getAge() {
		return age;
	}

	/** 
	 * Set the age.
	 * @param age The age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/** 
	 * Returns the name.
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/** 
	 * Set the name.
	 * @param name The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
}