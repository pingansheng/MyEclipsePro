package com.pas.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pas.domain.Department;
import com.pas.domain.Employee;
import com.pas.service.interfaces.DepartmentServiceInter;
import com.pas.service.interfaces.EmployeeServiceInter;

public class EmployeeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource
	private DepartmentServiceInter departmentService;
	@Resource
	private EmployeeServiceInter employeeService;
	
	private String flag;

	private String id;
	private String name;
	private String department;
	private String email;
	private String pwd;
	private String grade;
	private String salary;
	private String hiredate;
	
	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	private String pagenow;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPagenow() {
		return pagenow;
	}

	public void setPagenow(String pagenow) {
		this.pagenow = pagenow;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String execute() throws Exception {
		Map<String,Object> request = (Map<String,Object>)ActionContext.getContext().get("request");
		if ("addEmployee".equals(flag)) {
			return toaddEmployeeUI(request);
		}
		if ("addtoDB".equals(flag)) {
			return addEmployee();
		}
		if("showEmployee".equals(flag))
		{
			return showEmployees(request);
		}
		if(flag.startsWith("del_"))
		{
			return delEmployee(request);
		}
		if(flag.startsWith("update_"))
		{
			return toUpdateEmployee(request);
		}
		if(flag.startsWith("updatetodb"))
		{
			return updateEmployee();
		}
		return "err";
	}

	private String toUpdateEmployee(Map<String, Object> request) {
		String id=flag.split("_")[1];
		if("".equals(id) || null==id)
		{
			return "err";
		}
		Employee e=(Employee) employeeService.findById(Employee.class, Integer.parseInt(id));
		request.put("emptoupdate", e);
		List<Department> depts=departmentService.getDepartments();
		request.put("deptlist", depts);
		return "updateemp";
	}

	public String toaddEmployeeUI(Map<String, Object> request) {
		List<Department> depts=departmentService.getDepartments();
		request.put("deptlist", depts);
		return "add";
	}

	public String delEmployee(Map<String, Object> request) {
		String id=flag.split("_")[1];
		if("".equals(id) || null==id)
		{
			return "err";
		}
		employeeService.delObject(Employee.class, new Integer(id));
		return showEmployees(request);
	}

	public String addEmployee() {
		try {
			// Ìí¼Ó
			Employee e=new Employee();
			e.setName(name);
			e.setEmail(email);
			e.setGrade(Integer.parseInt(grade));
			e.setHiredate(new Date());
			e.setPwd(pwd);
			e.setSalary(Float.parseFloat(salary));
			Department dept=(Department) departmentService.findById(Department.class,Integer.parseInt(department));
			e.setDepartment(dept);
			employeeService.saveObject(e);
			return "ok";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "add";
	}

	public String showEmployees(Map<String, Object> request) {
		if("".equals(pagenow)||null==pagenow)
		{
			pagenow="1";
		}
		request.put("emplist", employeeService.getEmployeesByPage(4, Integer.parseInt(pagenow)));
		int pageCount=employeeService.getPageCount(4);
		request.put("pageCount", pageCount);
		return "emplist";
	}
	
	public String updateEmployee() {
		try {
			// ¸üÐÂ
			Employee e=new Employee();
			e.setId(Integer.parseInt(id));
			e.setName(name);
			e.setEmail(email);
			e.setGrade(Integer.parseInt(grade));
			e.setPwd(pwd);
			e.setSalary(Float.parseFloat(salary));
			Department dept=(Department) departmentService.findById(Department.class,Integer.parseInt(department));
			e.setDepartment(dept);
			employeeService.updateObject(e);
			return "ok";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "err";
	}
}
