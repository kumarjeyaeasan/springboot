package com.js.service;

import java.util.List;

import com.js.model.Employee;

public interface IEmployeeMgmtService {
	public Employee getEmpDetailsById(int eno);
	public List<Employee> getEmpByDept(int deptno);
}
