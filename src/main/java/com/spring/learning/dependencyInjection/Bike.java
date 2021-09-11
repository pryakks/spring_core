package com.spring.learning.dependencyInjection;

public class Bike{

	String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColor() {
		System.out.println("Bike color is: "+color);
	}

}
