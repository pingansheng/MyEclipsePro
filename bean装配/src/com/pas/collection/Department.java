package com.pas.collection;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Department {

	private String name;
	private String[] empname;
	private List<Employee> emps;
	private Set<Employee> empsSet;
	private Map<String, Employee> empMaps;

	public Map<String, Employee> getEmpMaps() {
		return empMaps;
	}

	public void setEmpMaps(Map<String, Employee> empMaps) {
		this.empMaps = empMaps;
	}

	public Set<Employee> getEmpsSet() {
		return empsSet;
	}

	public void setEmpsSet(Set<Employee> empsSet) {
		this.empsSet = empsSet;
	}

	public String getName() {
		return name;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getEmpname() {
		return empname;
	}

	public void setEmpname(String[] empname) {
		this.empname = empname;
	}

}
