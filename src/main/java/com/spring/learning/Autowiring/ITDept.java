package com.spring.learning.Autowiring;

public class ITDept implements Department{
	public ITDept() {
		System.out.println("IT Dept ctor");
	}
	public void work() {
		System.out.println("IT Dept work");
	}
}
