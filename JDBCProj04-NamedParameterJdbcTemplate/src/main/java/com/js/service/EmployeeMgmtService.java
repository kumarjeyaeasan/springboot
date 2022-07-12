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

	@Override
	public String getEmpNameByNo(int eno) {
		return dao.getEmpNameByNo(eno);
	}

	@Override
	public List<Employee> getEmpByDept(int deptno) {
		return dao.getEmpByDept(deptno);
	}

	@Override
	public int inserEmployee(Employee emp) {
		
		return dao.inserEmployee(emp);
	}
	
	
}
