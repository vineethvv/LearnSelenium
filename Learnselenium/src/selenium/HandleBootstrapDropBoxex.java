package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapDropBoxex {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
			
			// to launch the browser
			
			WebDriver driver = new ChromeDriver();
			
			// to maximize the page
			
			driver.manage().window().maximize();
			
			// to delete all cache/ cookies
			
			driver.manage().deleteAllCookies();
			
			// to launch the url
			
			driver.get("https://getbootstrap.com/docs/4.4/components/dropdowns/");
			
			//Dynamic wait
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);  // this wait is for page to getting fully loaded
					
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   // this wait is for the elements in the page to getting fully loaded
			
			// click on dropdown button
			
			driver.findElement(By.id("dropdownMenuButton")).click();
			
			List<WebElement> list=  driver.findElements(By.xpath("//div[contains(@class, 'dropdown-menu show')]//a"));
			
			System.out.println(list.size());
			
			for(int i =0; i<list.size(); i++) {
				
				System.out.println(list.get(i).getText());
				
				if(list.get(i).getText().equals("Actions")) {
					
					list.get(i).click();
					
					break;
					
				}
			}

	}

}
