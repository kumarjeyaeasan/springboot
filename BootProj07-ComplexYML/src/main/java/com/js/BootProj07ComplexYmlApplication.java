package com.js;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.js.modal.Employee;

@SpringBootApplication
public class BootProj07ComplexYmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj07ComplexYmlApplication.class, args);
		Employee emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
	
		((ConfigurableApplicationContext) ctx).close();
	}

}
