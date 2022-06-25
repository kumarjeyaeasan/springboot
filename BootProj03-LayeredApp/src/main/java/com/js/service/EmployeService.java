package com.js.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.dao.IEmployeeDAO;
import com.js.entity.Employee;

@Service("empService")
public class EmployeService implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public List<Employee> fetAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		
		List<Employee> list = dao.getEmployeesByDesgs(desg1, desg2, desg3);
		

		return list;
	}

}
