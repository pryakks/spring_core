package com.spring.learning.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * <bean id="empObj" class="com.spring.learning.annotation.Employee" /> == @Component
 * naming convention matters context.getBean("employee", Employee.class); == Employee class name
 */

//@Component
@Component("KKS")
public class Employee {
//	
//	@Autowired
//	SoftwareCompany company;
//
//	@Autowired
//	HardwareCompany hcompany;
	@Value("${emp.employeeName}")
	String employeeName;
	
	@Autowired
	@Qualifier("hardwareCompany")
	Company comp;
	
	public void greed() {
		System.out.println("Hello Employee : "+ employeeName);
	}
}
