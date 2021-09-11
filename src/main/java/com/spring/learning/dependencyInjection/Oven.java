package com.spring.learning.dependencyInjection;

public class Oven{

	Appliance appliance;
	
	public Oven(Appliance appliance) {
		this.appliance = appliance;
	}

	public void start() {
		if (appliance == null) {
			System.out.println("unable to start oven");
		} else {
			appliance.start();
		}
	}

}
