package selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshotconcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		// to launch the browser
		
					WebDriver driver = new ChromeDriver();
					
					// to maximize the page
					
				    driver.manage().window().maximize();
				    
				    // to delete all cache
					
				     driver.manage().deleteAllCookies();
				     
				     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				 										
					// to launch google
					
					driver.get("https://www.google.com");
					
					// to take the screenshot and store it as a file format
					
					File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					
					// now copy the screenshot to desired location using 'copyfile' method
					
					//FileUtils.copyFile(src, new File("C:\\Users\\vineethg\\eclipse-workspace\\learnselenium\\src\\learnselenium\\google.png"));
					
	}

}
