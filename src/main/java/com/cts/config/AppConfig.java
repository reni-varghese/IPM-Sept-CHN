package com.cts.config;

import java.awt.Point;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.cts.model.Circle;

@Configuration
public class AppConfig {

	@Bean("newBean")
	@Scope("prototype")
	@Lazy
	public Circle myNewBean() {
		
		return new Circle();
		
	}
	
}
