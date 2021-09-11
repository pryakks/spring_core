package com.spring.learning.value;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	public void emplyeeBean() {
		System.out.println("employee bean called");
	}

//	@Value("Abhishek")
	@Value("${employee.empName}")
	String empName;
	
//	@Value("1234")
	@Value("${employee.empId}")
	int empId;
	
//	@Value("Python Developer")
	@Value("${employee.empSkills}")
	String empSkills;

	public void showDetails() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Skills: " + empSkills);
	}

}
