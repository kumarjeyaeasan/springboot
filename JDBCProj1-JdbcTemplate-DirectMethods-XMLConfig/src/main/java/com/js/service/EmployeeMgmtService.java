package com.js.service;

import com.js.dao.IEmployeeDAO;

public class EmployeeMgmtService implements IEmployeeMgmtService {
	private IEmployeeDAO dao;
	
	public EmployeeMgmtService(IEmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public int getEmpCount() {
		return dao.getEmpCount();
	}

	@Override
	public String getEmpByName(int eno) {
		return dao.getEmpNameByEno(eno);
	}
}
