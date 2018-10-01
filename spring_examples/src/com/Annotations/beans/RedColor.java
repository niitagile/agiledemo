package com.Annotations.beans;
interface MyColor {
	 
    void printColor(); 
}

public class RedColor implements MyColor {
	  @Override
	    public void printColor() {
	        System.out.println("It is red in color...");
	    }
}
