package com.pas.collection;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Master {

	private String name;
	private Dog dog;
	public Master()
	{
	}
	public Master(Dog d)
	{
		this.dog=d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}

}
