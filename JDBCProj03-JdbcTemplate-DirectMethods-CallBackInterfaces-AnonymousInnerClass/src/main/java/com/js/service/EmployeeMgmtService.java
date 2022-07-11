package com.js.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.js.dao.IEmployeeDAO;

import com.js.model.Employee;

@Service("empService")
public class EmployeeMgmtService implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeDAO dao;
	
	public Employee getEmpDetailsById(int eno) {
		
		return dao.getEmpDetailsById(eno);
	}

	@Override
	public List<Employee> getEmpByDept(int deptno) {
		
		return dao.getEmpByDept(deptno);
	}
}
