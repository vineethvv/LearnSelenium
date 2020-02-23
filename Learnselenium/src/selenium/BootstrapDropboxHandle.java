package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropboxHandle {

	public static void main(String[] args) {
		
		
       System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		// to launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		// to maximize the page
		
		driver.manage().window().maximize();
		
		// to delete all cache/ cookies
		
		driver.manage().deleteAllCookies();
		
		// to launch the url
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=6.0_5");
		
		//Dynamic wait
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);  // this wait is for page to getting fully loaded
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   // this wait is for the elements in the page to getting fully loaded
		
		// click on dropdown
		
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-danger']")).click();
		
		// driver.findElements will return list of web elements 

		
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class, 'dropdown-menu inner')]//li//a"));
		
		System.out.println(list.size());
		
		// select all values from dropdown
		
            for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i).getText());
					
			list.get(i).click();
			
            }
		
		// select 'HTML' from drop down
		
		//for(int i=0; i<list.size(); i++) {
			
			//System.out.println(list.get(i).getText());
			
			//if(list.get(i).getText().equals("HTML")) {
			
			//list.get(i).click();
			//break;
		//}
		
		
		//}	
		
		

	}

	}
