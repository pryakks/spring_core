package com.spring.learning.Autowiring;

public class HRDept implements Department {
	public HRDept() {
		System.out.println("HR DEpt ctor");
	}
	public void work() {
		System.out.println("HR DEpt work");
	}
}
