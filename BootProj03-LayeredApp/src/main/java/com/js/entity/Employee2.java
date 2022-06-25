package com.js.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Employee2 {
	private Integer eno;
	private String ename;
	private String job;
	private Double salary;
	private Integer deptno;
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + ", deptno="
				+ deptno + "]";
	}
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	
}
