package com.spring.learning.dependencyInjection;

public class Car {

	String color;

	public Car(String color) {
		this.color = color;
	}

	public void showColor() {
		System.out.println("Car color is: " + color);
	}
}
