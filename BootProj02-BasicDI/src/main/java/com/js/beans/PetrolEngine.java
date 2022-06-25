package com.js.beans;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine: 0-param Constructor");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Petrol Engine Started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Petrol Engine Stopped");

	}

}
