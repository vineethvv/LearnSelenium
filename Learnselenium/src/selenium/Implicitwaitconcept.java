package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwaitconcept {

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
		
		// Advantages of dynamic wait is that if we gave wait for 30 sec but if the page/element is appeared in 3 sec , immediately the 
		// the action will be performed it will ingore the remaining 27 seconds.
		
		// Thread.sleep is a static wait this is reverse of dynamic wait ie , if we gave wait for 30 sec but if the page/element is
		// appeared in 3 sec , the action will not be performed immediately it will wait for the remaining 27 seconds even though the page/element
		// is found within the given time.
		
		
		

	}

}
