package com.js.beans;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine: 0-param Constructor");
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Diesel Engine Started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Diesel Engine Stopped");
	}

}
