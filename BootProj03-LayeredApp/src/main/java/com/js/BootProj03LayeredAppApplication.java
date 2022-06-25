
package com.js;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.js.controller.PayrollOperationsController;
import com.js.entity.Employee;

@SpringBootApplication
public class BootProj03LayeredAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj03LayeredAppApplication.class, args);
		
		PayrollOperationsController controller = ctx.getBean("payroll",PayrollOperationsController.class);
		try {
			List<Employee> list = controller.getAllEmployeesByDesgs("dev", "accounts", "admin");
			list.forEach(emp->{
				System.out.println(emp);
				});
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) ctx).close();
	
	}

}
