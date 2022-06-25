package com.js.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Target Class
@Component("vehicle")
public class Vehicle {
	
	@Autowired
	//@Qualifier("electric")
	//@Qualifier("{engine.type}) // Invalid
	//@Qualifier("Value{engine.type}) // Invalid
	//@Value("Value{engine.type}) // Invalid
	@Qualifier("engine")
	private IEngine eng;
	
	public Vehicle() {
		System.out.println("Vehichle: 0-param Constructor");
	}
	
	public void journey(String start, String dest) {
		eng.start(); 
		System.out.println("Journey Sarted at: "+start);
		eng.stop();
		System.out.println("Journey Stopped: "+dest);
	}

}
