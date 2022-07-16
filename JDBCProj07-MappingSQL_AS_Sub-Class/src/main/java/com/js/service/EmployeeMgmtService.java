package com.js.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.dao.IEmployeeDAO;

@Service("empService")
public class EmployeeMgmtService implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public String getEmpNameByNo(int eno) {
		return dao.getEmpNameByNo(eno);
	}

	
	
}
