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
