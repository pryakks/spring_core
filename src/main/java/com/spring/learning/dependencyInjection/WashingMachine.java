package com.spring.learning.dependencyInjection;

public class WashingMachine{

	Appliance appliance;
	
	public WashingMachine(Appliance appliance) {
		this.appliance = appliance;
	}

	public void start() {
		if (appliance == null) {
			System.out.println("unable to start appliance");
		} else {
			appliance.start();
		}
	}

}
