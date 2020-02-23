package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectcalenderByJS {

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
				 								
					// to launch the site
					
					driver.get("https://www.spicejet.com");
					
								
					WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
					
					String datevalue = "25/02";
					
					selectdatebyJS(driver, date, datevalue);

			}
			
			

			public static void selectdatebyJS(WebDriver driver ,WebElement element, String datevalue) {
				
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("arguments[0].setAttribute('value','"+datevalue+"');", element);
				
			}


	}

