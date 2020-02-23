package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

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
				
				driver.get("https://www.google.com");
				
				// enter value in the search text field
				
				driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
				
				// 'findelements' will give one list of elements & store this in a 'list' object
				
				List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));  //-----> customized dyanamic xpath
				
				System.out.println("total number of suggestions in search box:" + list.size());
				
				for(int i =0; i<list.size(); i++) {
					
					System.out.println(list.get(i).getText());
							
					
					if(list.get(i).getText().equals("testing mavens")){
						
						list.get(i).click();
						
						break;   // it is used to break the loop, ie the moment the keyword is found immediately the control will come out of the for loop
						
					}
					
					
				}

	}

}
