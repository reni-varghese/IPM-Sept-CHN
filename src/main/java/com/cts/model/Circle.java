package com.cts.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Circle implements InitializingBean,DisposableBean {
	
	public void draw() {
		System.out.println("Circle drawn!!");
	}

	public Circle() {
		System.out.println("constructor of circle executed");
	}
	
	public void myInit() {
		System.out.println("My init method executed");
	}
	
	public void myDestroyMethod() {
		System.out.println("My destroy method executed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After properties set");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method of disposableBean");
		
	}
	
	

}
