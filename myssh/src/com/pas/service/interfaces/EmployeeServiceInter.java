package com.pas.service.interfaces;

import java.io.Serializable;
import java.util.List;

import com.pas.domain.Employee;

public interface EmployeeServiceInter extends BaseServiceInter{
	
	public Employee checkEmployee(Employee e);
	
	public List<Employee> getEmployeesByPage(int pageSize,int pageNow);
	
	public int getPageCount(int pageSize);
}
