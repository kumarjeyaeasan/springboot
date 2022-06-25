package com.js.beans;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricEngine implements IEngine {

	public ElectricEngine() {
		System.out.println("ElectricEngine: 0-param Constructor");
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Electric Engine Started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Electric Engine Stopped");

	}

}
