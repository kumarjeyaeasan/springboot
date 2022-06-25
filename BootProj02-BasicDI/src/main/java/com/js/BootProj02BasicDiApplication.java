package com.js;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.js.beans.Vehicle;

@SpringBootApplication
@ImportResource("com/js/cfg/applicationContext.xml")
public class BootProj02BasicDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj02BasicDiApplication.class, args);
		Vehicle v = ctx.getBean("vehicle",Vehicle.class);
		v.journey("Bangalore", "Virudhunagar");
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
