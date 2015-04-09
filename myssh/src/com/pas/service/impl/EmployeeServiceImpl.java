package com.pas.service.impl;

import java.io.Serializable;
import java.util.List;

import com.pas.domain.Department;
import com.pas.domain.Employee;
import com.pas.service.interfaces.EmployeeServiceInter;

public class EmployeeServiceImpl extends BaseServiceImpl implements EmployeeServiceInter {

	public Employee checkEmployee(Employee e) {
		String hql = "from Employee where id=? and pwd=?";
		Object[] params = new Object[] { e.getId(), e.getPwd() };
		
		List<Employee> list =(List<Employee>) super.executeQuery(hql, params);
		if (list.size() != 0) {
			return list.get(0);
		}
		return null;
	}

	public List<Employee> getEmployeesByPage(int pageSize,int pageNow) {
		String hql="from Employee order by id";
		return (List<Employee>) this.executeQueryByPage(hql, null, pageNow, pageSize);
	}

	public int getPageCount(int pageSize) {
		String hql="select count(*) from Employee";
		return this.getPageCount(hql, null, pageSize);
	}
}
