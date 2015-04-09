package com.pas.service.impl;

import java.util.List;

import com.pas.domain.Department;
import com.pas.service.interfaces.DepartmentServiceInter;

public class DepartmentServiceImpl extends BaseServiceImpl implements DepartmentServiceInter{
	
	public List<Department> getDepartments()
	{
		List<Department> executeQuery = (List<Department>) super.executeQuery("from Department", null);
		return executeQuery;
	}
}
