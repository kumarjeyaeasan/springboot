package com.js;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.js.modal.Customer;

@SpringBootApplication
public class BootProj07YmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj07YmlApplication.class, args);
		Customer c = ctx.getBean("customer",Customer.class);
		System.out.println(c);
		((ConfigurableApplicationContext) ctx).close();
	}

}
