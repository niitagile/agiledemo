package com.Annotations.AutoWire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
public class Country {
 
	String countryName;
	 
	//This annotation is applied on fields, setter methods, and constructors. 
	//The @Autowired annotation injects object dependency implicitly.
	
	//@Autowired
	//@Qualifier("CB") 
	Capital capital;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Capital getCapital() {
		return capital;
	}
 
	@Required
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
}
 