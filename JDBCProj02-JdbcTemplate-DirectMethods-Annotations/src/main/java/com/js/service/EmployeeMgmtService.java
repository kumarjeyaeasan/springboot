package com.js.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.dao.IEmployeeDAO;

@Service("empService")
public class EmployeeMgmtService implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO dao;


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
