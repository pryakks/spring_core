package com.spring.learning.dependencyInjection;

public class Aeroplane {
	Engine engine;

	String color;
	public void showColor() {
		System.out.println("Bike color is: "+color);
	}
	
	public Aeroplane(Engine engine) {
		this.engine = engine;
		System.out.println("call from ctor");
	}

	public void startEngine() {
		if (engine == null) {
			System.out.println("unable to start engine");
		} else {
			engine.start();
		}
	}
}
