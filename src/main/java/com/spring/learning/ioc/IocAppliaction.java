package com.spring.learning.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Key {
	public void run(Engine key) {
		key.start();
	}
}

public class IocAppliaction {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/learning/ioc/beans.xml");
		Engine bikeKey = (Engine) context.getBean("bikeEngine");
		new Key().run(bikeKey);
		Engine carKey = (Engine) context.getBean("carEngine");
		new Key().run(carKey);

	}
}
