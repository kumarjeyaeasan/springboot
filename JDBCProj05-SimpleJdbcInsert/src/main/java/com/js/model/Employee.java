package com.js.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private Integer eno;
	private String ename;
	private String job;
	private Float salary;
	private Integer deptno;
}
