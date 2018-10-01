//how to read from IOC Container

package com.ReadBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	/*The BeanFactory is the actual container which instantiates, configures, and 
	 * manages a number of beans. These beans typically collaborate with one another, 
	 * and thus have dependencies between themselves. 
	 * These dependencies are reflected in the configuration data used by the BeanFactory*/
	
	
	
	Resource resource=new ClassPathResource("com/ReadBean/applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	
	Student student=(Student)factory.getBean("studentbean");
	student.displayInfo();
	
	
	/*
	ApplicationContext context =   
    new ClassPathXmlApplicationContext("com/ReadBean/applicationContext.xml"); 
    Student student=(Student)factory.getBean("studentbean");
	student.displayInfo();
   
   */ 
}
}
