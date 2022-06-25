package com.js;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.js.controller.HotelController;
import com.js.entity.Hotel;

@SpringBootApplication
public class BootProj04LayeredAppAsg2Application {
	
	 

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj04LayeredAppAsg2Application.class, args);
		
		HotelController controller =  ctx.getBean("hotelController",HotelController.class);
		
		try {
			List<Hotel> list = controller.getHotelsByCity("Bangalore", "Mumbai", "Toronto");
			list.forEach(hotel->{
				System.out.println(hotel);
				});
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
