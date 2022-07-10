package com.js;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.js.service.IEmployeeMgmtService;

public class JDBCTempTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/js/config/applicationContext.xml");
		IEmployeeMgmtService service = ctx.getBean("empService",IEmployeeMgmtService.class);
		try {
			System.out.println("JDBCTempTest.main():: "+service.getEmpCount());
			System.out.println("Emp Name:: "+service.getEmpByName(1));
			System.out.println("Emp Record:: "+service.getEmpDetails(1));
			System.out.println("All Emp Records:: "+service.getAllEmp());
			System.out.println("Delete Emp Records:: "+service.delEmpByDeptId(40));
			//System.out.println("Update Emp By Dept:: "+service.updEmpSalByDeptId(10));
			//System.out.println("Insert Emp Record:: "+service.insNewEmp(4, "Raj", "dev", 5000.0f, "10"));
														    
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		ctx.close();
	}
	
}
