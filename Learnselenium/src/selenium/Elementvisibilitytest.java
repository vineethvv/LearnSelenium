package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementvisibilitytest {

	public static void main(String[] args) {
	
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		// to launch the browser
		
				WebDriver driver = new ChromeDriver();
				
				// to maximize the page
				
			    driver.manage().window().maximize();
			    
			    // to delete all cache
				
			     driver.manage().deleteAllCookies();
			     
			     
			     // Dynamic wait
			     
			     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 								
				// to launch the site
				
				driver.get("https://register.freecrm.com/register/");
				
				
				//1. isDisplayed() method : is applicable for all the elements
				
				// Also it will check whether the particular element is displayed or not
				
				// It will returm true if it is displayed otherwise it will return false
				
				//  isDisplayed() method will return a boolean value 
				
				// xpath for signup button
				
				boolean b1 = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
				
				System.out.println(b1);
				
				//2. isEnabled() method: is primarily used for buttons
				
				//  Also it will check whether the particular element is enabled or not
				
				// It will returm true if it is enabled otherwise it will return false
				
				//  isEnabled()  method will also return a boolean value 
				
				boolean b2 = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
				
				System.out.println(b2);
				
				//3. isSelected() method : : only applicable for checkbox, dropdown, radio button
				
				// Also it will check whether the particular element is selected or not
				
				// It will returm true if it is selected otherwise it will return false
				
				//  isSelected()  method will also return a boolean value 
				
				
				
				// check whether the 'I Agree to the terms and conditions' checkbox is selected or not
				
				boolean b3 = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
				
				System.out.println(b3);
				
				
	}

}
