package com.spring.learning.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * value 
 */

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/learning/value/beans.xml");

		Employee emp = (Employee) context.getBean("emp", Employee.class);
		emp.showDetails();
	}
}
