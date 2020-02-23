package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		// to launch the browser
		
				WebDriver driver = new ChromeDriver();
				
				// to maximize the page
				
			    driver.manage().window().maximize();
			    
			    // to delete all cache
				
			     driver.manage().deleteAllCookies();
			     
			     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			     
			     // back & forward button simulations
			 		
							
				// to launch google
				
				driver.get("https://www.google.com");
				
				// to launch refiff
				
				driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");  // both the 'driver.get' & 'driver.navigate().to' is used to lauch the url
				                                                                    // but the 'driver.navigate().to' is used to switch to the external url from the current url
				
				
				// click onto browser back button
				
				driver.navigate().back();
				
				Thread.sleep(3000);
				
				// click onto browser forward button
				
				driver.navigate().forward();
				
				Thread.sleep(3000);
				
				// again click onto browser back button
				
				driver.navigate().back();
				
				// to refresh the page
				
				driver.navigate().refresh();
				


	}

}
