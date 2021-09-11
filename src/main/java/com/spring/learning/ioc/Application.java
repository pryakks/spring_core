package com.spring.learning.ioc;

/*
 * IOC loosely coupled.
 * Also known as Dependency Injection
 * we need to concentrate on business logic object spring boot will create
 * IOC create objects for us it inject directly
 * control is given to Object container we dont need to create object
 * IOC= create object + manage object + inject object
 */

class Keys{
	public void run(Bike key) {
//		new Car().start();//Car has been started: control is here
		key.start();//Bike has been started tightly coupled
	}
	
	//funciton overloaded
	public void run(Car key) {
		key.start();
		//Bike has been started
//		Car has been started
	}
	
	public void runFromMain(Engine key) {
		key.start();
	}
}
public class Application {
	public static void main(String[] args) {
//		tightly coupled
		new Keys().run(new Bike());//Bike has been started control is here
		new Keys().run(new Car());//Car has been started control is here
		
//		loosely coupled
		new Keys().runFromMain(new Bike());//Bike has been started
		new Keys().runFromMain(new Car());//Car has been started
				
	}
}
