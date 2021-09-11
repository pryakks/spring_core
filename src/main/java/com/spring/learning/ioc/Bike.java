package com.spring.learning.ioc;

public class Bike implements Engine{

	@Override
	public void start() {
		System.out.println("Bike has been started");
	}

}
