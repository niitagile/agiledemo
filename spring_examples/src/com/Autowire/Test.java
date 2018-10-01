package com.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	
	 ApplicationContext context = new ClassPathXmlApplicationContext("com/Autowire/applicationContext.xml");
     TextEditor te = (TextEditor) context.getBean("textEditor");
     te.spellCheck();
	}
	}
