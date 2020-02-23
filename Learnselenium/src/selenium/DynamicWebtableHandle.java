package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtableHandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		// to launch the browser
		
				WebDriver driver = new ChromeDriver();
				
				// to maximize the page
				
			    driver.manage().window().maximize();
			    
			    // to delete all cache
				
			     driver.manage().deleteAllCookies();
			     
			     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 								
				// to launch the site
				
				driver.get("https://www.freecrm.com");
				
				// click on login
				
							driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
							
							Thread.sleep(3000);
							
							// enter username & password
							
							driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vineeth.g773@gmail.com");
							
							driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Automation@123");
							
							// click on login
							
							driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
							
							// click on contacts
							
							driver.findElement(By.xpath("//span[text()='Contacts']")).click();
							
							driver.navigate().refresh();
							
							// select a contact
							
							driver.findElement(By.xpath("//td[text()='dfhdfh dfh']//preceding-sibling::td")).click();
							
							

			
	}

}
