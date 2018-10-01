package com.Annotations.AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Test{
 
	    public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/Annotations/AutoWire/ApplicationContext.xml");
 
		Country countryObj = (Country) appContext.getBean("CountryBean");
		String countryName=countryObj.getCountryName();
		Capital capital=countryObj.getCapital();
		String capitalName=capital.getCapitalName();
		System.out.println(capitalName+" is capital of "+countryName);
		       
	}
}