package com.Annotations.beans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MyAppConfig {
	@Bean(name="myCBean")
	public MyColor getMyColors(){
		return new RedColor();
}
}
