package com.js;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.js.beans.Company;

/**
 * @author senthilkumar
 *
 */
@SpringBootApplication
public class BootProj05ConfigurationPropApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj05ConfigurationPropApplication.class, args);
		Company company = ctx.getBean("comp", Company.class);
		System.out.println(company);
		((ConfigurableApplicationContext) ctx).close();
	}

}
