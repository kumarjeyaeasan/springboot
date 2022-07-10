package com.js.service;

import java.util.List;
import java.util.Map;

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

	@Override
	public Map<String, Object> getEmpDetails(int eno) {
		return dao.getOneEmpRecord(eno);
	}

	@Override
	public List<Map<String, Object>> getAllEmp() {
		// TODO Auto-generated method stub
		return dao.getAllEmp();
	}

	@Override
	public int delEmpByDeptId(int deptno) {
		return dao.delEmpByDeptId(deptno);
	}

	@Override
	public int updEmpSalByDeptId(int deptno) {
		return dao.updEmpSalByDeptId(deptno);
	}

	@Override
	public int insNewEmp(int eno, String ename, String job, float sal, String depno) {
		return dao.insNewEmp(eno, ename, job, sal, depno);
	}
}
