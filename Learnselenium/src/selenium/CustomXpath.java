package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

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
		
		// Enter value in search text field
		
		//driver.findElement(By.xpath("(//input[@class='gh-tb ui-autocomplete-input'])[1]")).sendKeys("java");
		
		driver.findElement(By.xpath("//input[contains(@class, 'gh-tb ui-autocomplete-input')]")).sendKeys("java");    // writing xpath using 'contains' method
		
		
		// starts-with
		// Dynamic id:
		
		// id= test_123
		
		//id= test_456
		
		//id = test_789  // here in some cases 'id' may chance frequently , this is known as dynamic id, so inorder to overcome this situation
		
		// we use the method contains. 
		
		// format to write the xpath if the id is dynamic
		
		//driver.findElement(By.xpath("//input[contains(@id, 'test_')]")).sendKeys("java");
		
		// Another syntax to write the xpath if the id is dynamic by using 'starts-with' method
		
		
		//driver.findElement(By.xpath("//input[starts-with(@id, 'test_')]")).sendKeys("java");
		
		
		// ends-with
		// Dynamic id :
		
		// id = 123_test_t
		
		// id = 456_test_t
		
		// id = 789_test_t
		
		//driver.findElement(By.xpath("//input[ends-with(@id, '_test_t')]")).sendKeys("java");  // this 'ends-with' method we have to use if the ending value is
		
		// changing frequently
		
		// for links : custom xpath
		 
		// for all the links the 'tag name' will starts with <a>
		
		driver.findElement(By.xpath("//a[contains(text(), 'Daily Deals')]")).click();
		
		
		// Absolute xpath is not recomended
		
		// Disadvanteges of absolute xpath:
		
		//1. performance issue
		
		//2. not reliable
		
		//3. can be changed at any time in future
		
		
		// Advantages of customized/relative xpath
		
		//1. very fast
		
		//2. syntax is very simple
		
		//3. performance issue will not be there
		
		//4. it is unique
		
		
		
		
		
	
		
		
				
	}

}
