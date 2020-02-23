package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HtmlUnitDriverconcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		// to launch the browser
		
					//WebDriver driver = new ChromeDriver();
				    
				    // Note : HtmlUnitDriver is not available in selenium 3.x version
				    // HtmlUnitDriver---> to use this concept, we have to download HtmlUnitdriver JAR file
				    // HtmlUnitDriver is also called 'Ghost driver' or 'Headless browser', some of the ghost drivers are :
				       
				       // 1. HtmlUnitDriver --- Java
				       //2. PhantomJS--- JavaScript
				    
				    //Advantages of HtmlUnitDriver :
				    
				    //1. testing is hapenning behind the scene -- no browser is launched
				    //2. very fast--- execution of testcase is very fast--- performance of the script
				    
				    //Disadvantes
				    
				    //1. not suitable for Actions class--- user actions like doubleclick, drag & drop, mousemovements
				    
				    WebDriver driver = new HtmlUnitDriver();
				    		
					
					// to maximize the page
					
				    driver.manage().window().maximize();
				    
				    // to delete all cache
					
				     driver.manage().deleteAllCookies();
				     
				     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 								
					// to launch the site
					
					driver.get("https://www.freecrm.com");
					
					System.out.println("Before login the title is :" + driver.getTitle());
					
					Thread.sleep(3000);
					
					// click on login
					
					driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
					
					Thread.sleep(3000);
					
					// enter username & password
					
					driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vineeth.g773@gmail.com");
					
					driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Automation@123");
					
					// click on login
					
					driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
					
					System.out.println("After login the title is :" + driver.getTitle());
					
					


	}

}
