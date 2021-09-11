package com.spring.learning.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/learning/annotation/beans.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
//		Employee emp = context.getBean("employee", Employee.class);
		Employee emp = context.getBean("KKS", Employee.class);
		emp.greed();
		
//		emp.company.development();
//		emp.hcompany.development();
		emp.comp.development();
	}
}
