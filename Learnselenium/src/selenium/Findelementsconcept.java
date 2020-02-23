package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementsconcept {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		// to launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		// to maximize the page
		
		driver.manage().window().maximize();
		
		// to delete all cache/ cookies
		
		driver.manage().deleteAllCookies();
		
		// to launch the url
		
		driver.get("https://half.ebay.com");
		
		//Dynamic wait
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);  // this wait is for page to getting fully loaded
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   // this wait is for the elements in the page to getting fully loaded
		
		// to get the total count of links on the page
		
		// to get the text of each link on the page
		
		// driver.findElements will return list of web elements 
		
		List <WebElement> linklist= driver.findElements(By.tagName("a"));
		
		// size of linklist
		
		System.out.println(linklist.size());
		

	}

}
