package com.spring.learning.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Dependency Injection: 
 * fields via setter() 
 * <bean id="bike" class="com.spring.learning.dependencyInjection.Bike">
		<property name="color" value="RED"></property>
	</bean>
 * fields via constructor()
 * <bean id="car" class="com.spring.learning.dependencyInjection.Car">
		<constructor-arg name="color" value="BLUE"></constructor-arg>
	</bean>
	
 * Object via constructor()
 * <bean id="washingMachine" class="com.spring.learning.dependencyInjection.WashingMachine"> 
			<constructor-arg name="appliance"> 
				<bean class="com.spring.learning.dependencyInjection.Appliance"></bean> 
			</constructor-arg> 
		</bean> 
 * 	<constructor-arg name="appliance" ref="appliance"></constructor-arg>
 */


public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/learning/dependencyInjection/beans.xml");
//		Bike bikeColor = (Bike) context.getBean("bike");
//		bikeColor.showColor();
//		
//		Car carColor = (Car) context.getBean("car");
//		carColor.showColor();
//		
//		Aeroplane aeroplane = (Aeroplane) context.getBean("aeroplane");
//		aeroplane.startEngine();
//		aeroplane.showColor();
//		
//		//constructor called only once and we are using same aeroplane referecnce 
//		
//		Aeroplane aeroplane2 = (Aeroplane) context.getBean("aeroplane");
//		aeroplane2.color ="BLACK";
//		aeroplane.startEngine();
//		aeroplane.showColor();
		
		WashingMachine washingMachine = (WashingMachine) context.getBean("washingMachine");
		washingMachine.start();
		
		Oven oven = (Oven) context.getBean("oven");
		oven.start();
		
		//this calls two time ctor for one time ctor we need to set in bean individual ctor call 
		
	}
}
