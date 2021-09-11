package com.spring.learning.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan( basePackages= "com.spring.learning.annotation")
@PropertySource("classpath:com/spring/learning/annotation/employee-info")
class ConfigClass {

}
