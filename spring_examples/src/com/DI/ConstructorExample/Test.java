package com.DI.ConstructorExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("com/DI/ConstructorExample/appContext.xml");
		
		
		Employee e=(Employee)context.getBean("e");
		e.show();
			}
}
