package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	// Note ---> Each and every annotation should be associated with one method
	
		// Starting with @Before is know as pre-conditions annotations
		
		@BeforeSuite   // 1. 
		
		public void setup() {
			
			System.out.println("setup system property for chrome");
		}
		
		
	    @BeforeTest   // 2. 
		
		public void launchBrowser() {
			
			System.out.println("lauch chrome browser");
		}
		
		
		@BeforeClass  //3. 
		
		public void login() {
			
			System.out.println("Login to App");
		}
		
		/*
		 * 
		 * @BeforeMethod
		 * @Test-1
		 * @AfterMethod
		 * 
		 * @BeforeMethod
		 * @Test-2
		 * @AfterMethod
		 * 
		 */
		
	    	
		
		@BeforeMethod  //4. 
		
		public void enterURL() {
			
			System.out.println("enter URL");
			
		}
		
		
		// test cases-- Starting with @Test
		
		@Test  //5. 
		
		public void googleTitleTest() {
			
			System.out.println("Google Title Test");
		}
		
	    @Test  
		
		public void searchTest() {
			
			System.out.println("searchTest");
		}
		
		
		//Starting with @After is know as post-conditions annotations
		
		@AfterMethod //6.
		
		public void logout() {
			
			
			System.out.println("logout from App");
		}
		
	    @AfterClass  //7. 
		
		public void closebrowser() {
			
			System.out.println("close browser");
		}
		
		
		@AfterTest  //8.
		
		public void deleteallcookies() {
			
			System.out.println("delete all cookies");

}
		
}
