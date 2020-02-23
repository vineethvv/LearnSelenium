package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	
	    // expectedExceptions keyword is used to handle the exception, suppose if we already know what type of exception we are getting, in that case we have to mention the
		// exception so that the particular testcase wont get failed.
		
		
		@Test(expectedExceptions= NumberFormatException.class)
		
		public void test() {
			
			String x = "100A";
			
			Integer.parseInt(x);
		}
	

}
