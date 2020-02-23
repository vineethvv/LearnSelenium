package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
   @Test
	
	public void loginTest() {
		
		System.out.println("login test");
		
		//int i = 9/0;
	}
	
	// If the loginTest method is failed it will skip the HomepageTest method automatically cz HomepageTest method depends on loginTest , to create the dependency we are 
	// using the keyword dependsOnMethods
	
    @Test(dependsOnMethods="loginTest")
	
	public void HomepageTest() {
		
		System.out.println("Home page test");
	}



}
