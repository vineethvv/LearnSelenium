package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindowpopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		           System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		
		            // to launch the browser
		
					WebDriver driver = new ChromeDriver();
					
					// to maximize the page
					
				    driver.manage().window().maximize();
				    
				    // to delete all cache
					
				     driver.manage().deleteAllCookies();
				     
				     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				     
				     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				     
				     // to launch url
						
				     driver.get("http://popuptest.com/");
				     
				     //click on a link
				     
				     driver.findElement(By.xpath("//a[text()='Modeless Window']")).click();
				     
				     Thread.sleep(2000);
				     
				     // here "getWindowHandles" will give a 'set' of string it means that one <set> object will be there
				     
		             // were 2 window id's are available in particular 'handler' 

				     
				     
				     Set <String> handler = driver.getWindowHandles();  
				     
				     // note: In <set> object values are not stored based on the index so we cannot use for loop
				     
				     // so to get the values from <set> object we have to use Iterator
				     
				     // this 'iterator()' will give us an iterator of type string
				     
				     // Iterator will be pointing just above/top of the <Set> object memory
				     
				     // to shift the iterator from top to the <set> object memory, for that we have to use next() method
				     
				     Iterator<String> it = handler.iterator();  
				     
				     
				     String parentwindowid = it.next();         
				     
				     System.out.println("parent window id:"+ parentwindowid);
				     
				     
				     String childwindowid = it.next();
				     
				     System.out.println("Child window id:"+ childwindowid );
				     
				     
				     driver.switchTo().window(childwindowid);
				     
				     Thread.sleep(2000);
				     
				     System.out.println("child window poup title :"+ driver.getTitle());
				     
				     driver.close();  // to close only the second window popup
				     
				     
				     driver.switchTo().window(parentwindowid);
				     
				     Thread.sleep(2000);
				     
				     System.out.println("parent window popup title : "+ driver.getTitle());
			}

		}
