package com.js.dao;

import java.util.List;

import com.js.model.Employee;

public interface IEmployeeDAO {

	public String getEmpNameByNo(int eno);
	public List<Employee> getEmpByDept(int deptno);
	public int inserEmployee(Employee emp);
}
