package com.js.dao;

import java.util.List;

import com.js.model.Employee;

public interface IEmployeeDAO {

	public Employee getEmpDetailsById(int eno);
	public List<Employee> getEmpByDept(int deptno);
}
