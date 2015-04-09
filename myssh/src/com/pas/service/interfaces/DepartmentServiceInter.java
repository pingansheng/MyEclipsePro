package com.pas.service.interfaces;

import java.io.Serializable;
import java.util.List;

import com.pas.domain.Department;
import com.pas.domain.Employee;

public interface DepartmentServiceInter extends BaseServiceInter{
	public List<Department> getDepartments();
}
