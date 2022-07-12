package com.js;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.js.model.Employee;
import com.js.service.IEmployeeMgmtService;

public class JDBCTempTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/js/config/applicationContext.xml");
		
		IEmployeeMgmtService service = ctx.getBean("empService",IEmployeeMgmtService.class);
		
		try {
			System.out.println(service.getEmpNameByNo(1));
			System.out.println(service.getEmpByDept(10));
			
			Employee emp = new Employee();
			emp.setEno(5);
			emp.setEname("Shiv");
			emp.setJob("dev");
			emp.setSal(10000.0f);
			emp.setDepno(10);
			System.out.println(service.inserEmployee(emp));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		catch(Exception e) {
		}
		ctx.close();
	}
	
}
