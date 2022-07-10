package com.js.service;

import java.util.List;
import java.util.Map;

public interface IEmployeeMgmtService {
	public int getEmpCount();
	public String getEmpByName(int eno);
	public Map<String,Object> getEmpDetails(int eno);
	public List<Map<String,Object>> getAllEmp();
	public int delEmpByDeptId(int deptno);
	public int updEmpSalByDeptId(int deptno);
	public int insNewEmp(int eno,String ename, String job, float sal, String depno);
}
