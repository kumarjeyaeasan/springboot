package com.js.service;
import java.util.List;

import com.js.entity.Employee;
public interface IEmployeeService {

	public List<Employee> fetAllEmployeesByDesgs(String desg1,
			String desg2, String desg3) throws Exception;
}
