package com.js;

// Target Class (Main Class) , Configuration Class
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.js.beans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01BasicDiApplication {
	
	// Pre-defined class as spring bean using @Bean
	
	@Bean(name="ldt")
	public LocalDateTime createLDT() {
		return LocalDateTime.now(); // static factory method
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj01BasicDiApplication.class, args);
		
		WishMessageGenerator gen = ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println(gen.showMessage("Senthil"));
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
