package com.js.service;

import java.util.List;

import com.js.model.Employee;

public interface IEmployeeMgmtService {
	public String getEmpNameByNo(int eno);
	public List<Employee> getEmpByDept(int deptno);
	public int inserEmployee(Employee emp);
}
