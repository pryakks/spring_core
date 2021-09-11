package com.spring.learning.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //if we have 2 beans
public class SoftwareCompany implements Company {
	public void development() {
		System.out.println("softeare development");
	}
}
