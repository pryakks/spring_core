package com.spring.learning.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * by constructor
 * just create bean if class has any dependency it automatically search for that bean and inject that dependency
 * 
 * <bean id="deptObj" class="com.spring.learning.Autowiring.HRDept"></bean> 
	<bean id="company" class="com.spring.learning.Autowiring.Company" autowire="constructor" /> 
 * 
 * if in class it has 
 * department dept;
 * it will check bean is present or not. if present it automatically inject it 
 * 
 * Autowire doesnt work on primitive type  
 * by name
 * byType
 * default
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/learning/Autowiring/beans.xml");
		Company company = (Company) context.getBean("company");
//		company.companyWork();
		
		Department itCompany = (Department) context.getBean("deptIT");
		company.companyWorking(itCompany);
		
		Department hrCompany = (Department) context.getBean("deptHR");
		company.companyWorking(hrCompany);
		
	}
}
