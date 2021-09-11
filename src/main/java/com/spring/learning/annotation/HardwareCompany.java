package com.spring.learning.annotation;

import org.springframework.stereotype.Component;

@Component
public class HardwareCompany implements Company{
	public void development() {
		System.out.println("hardware development");
	}
}
