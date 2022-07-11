package com.js;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.js.service.IEmployeeMgmtService;

public class JDBCTempTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/js/config/applicationContext.xml");
		
		IEmployeeMgmtService service = ctx.getBean("empService",IEmployeeMgmtService.class);
		
		try {
			System.out.println(service.getEmpDetailsById(1));
			System.out.println(service.getEmpByDept(10));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		catch(Exception e) {
		}
		ctx.close();
	}
	
}
