package com.pas.action;

import java.util.LinkedList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.pas.domain.Cat;

public class ViewReport extends ActionSupport {
	
	private List<Cat> cats;

	public List<Cat> getCats() {


		this.cats=new LinkedList<Cat>();
		cats.add(new Cat(1,"Cat1",3));
		cats.add(new Cat(2,"Cat2",3));
		cats.add(new Cat(3,"Cat3",3));
		cats.add(new Cat(4,"Cat4",4));
		cats.add(new Cat(5,"Cat5",3));
		cats.add(new Cat(6,"Cat6",5));
		cats.add(new Cat(7,"Cat7",3));
		
		return cats;
	}

	public void setCats(List<Cat> cats) {
		this.cats = cats;
	} 
	
	public String execute() {
		return SUCCESS;
	}
}
