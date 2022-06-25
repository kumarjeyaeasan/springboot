package com.js.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.js.entity.Employee;
import com.js.service.IEmployeeService;

@Controller("payroll")
public class PayrollOperationsController {
	@Autowired
	private IEmployeeService service;
	
	public List<Employee> getAllEmployeesByDesgs(String desg1,
			String desg2, String desg3) throws Exception{
		
		List<Employee> list = service.fetAllEmployeesByDesgs(desg1, desg2, desg3);
		return list;
	}

}
