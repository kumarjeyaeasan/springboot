package com.js.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Dependent Class

@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired
	private LocalDateTime ldt; // HAS-A property

	// Business Method
	public String showMessage(String user) {
		int hour = ldt.getHour();
		if (hour<12)
			return "Good Morning "+user;
		else if (hour<16)
			return "GA "+user;
		else if (hour<20)
			return "GE "+user;
		else return "GN "+user;
	}
}
