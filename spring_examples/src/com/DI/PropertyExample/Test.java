package com.DI.PropertyExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context =   
		    new ClassPathXmlApplicationContext("com/DI/PropertyExample/applicationContext.xml");
	
	Question q1=(Question)context.getBean("q1");
	q1.displayInfo();
	Question q2=(Question)context.getBean("q2");
	q2.displayInfo();
}
}
