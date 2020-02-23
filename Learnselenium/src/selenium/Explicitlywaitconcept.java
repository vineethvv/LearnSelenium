package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitlywaitconcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		
		        // to launch the browser
		
				WebDriver driver = new ChromeDriver();
				
				// to maximize the page
				
			    driver.manage().window().maximize();
			    
			    // to delete all cache
				
			     driver.manage().deleteAllCookies();
			     
			     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     // to launch google
					
			     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
			     
			     // calling the method 'clickOn'
			     
			     clickOn (driver, driver.findElement(By.xpath("//input[@name='proceed']")), 20);

			}
			
			    //Explicitlywait ---> We are giving Explicitly wait for a specific element, but the implicitly wait for all the elements on the page
			
			
			    public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
				
				// creating a object called 'WebDriverWait' , 'WebDriverWait' is a class which is available in selenium 
				
				new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
				locator.click();
				
			}

	}
