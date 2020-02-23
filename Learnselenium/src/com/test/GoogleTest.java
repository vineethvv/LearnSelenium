package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
   WebDriver driver;
	
	
	@BeforeMethod 
	
	public void setup() {
		
		
		 System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
			
			// to launch the browser
			
			driver = new ChromeDriver();
			
             // to maximize the page
			
		    driver.manage().window().maximize();
		    
		    // to delete all cache
			
		     driver.manage().deleteAllCookies();
		     
		     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		     
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     
		     driver.get("http://www.google.com");
		    	
		
	}
	
            @Test(priority=1, groups="title")
	
	       public void googleTitleTest() {
            	
            String title = driver.getTitle();	
		
		   System.out.println(title);	
		   
		   
	       }
            
            @Test(priority=2, groups= "logo")
        	
        	public void googlelogo() {
        		
        		          	
            Boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
        	
            
            }
            
            @Test(priority=3, groups= "link test")
            
            public void maillinktest() {
            	
            	Boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
            }
            
            
	
	       @AfterMethod
	
	       public void tearDown() {
		
		   driver.quit();
		
		
		
	}



}
