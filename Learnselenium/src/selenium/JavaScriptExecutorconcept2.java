package selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorconcept2 {

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
			 								
				// to launch the site
				
				driver.get("https://www.freecrm.com");
				
				// click on login
				
							driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
							
							Thread.sleep(3000);
							
							// enter username & password
							
							driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vineeth.g773@gmail.com");
							
							driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Automation@1234");
							
							// click on login
							
							//driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
							
							
							
						WebElement logbuttn =	driver.findElement(By.xpath("//div[text()='Login']"));
						
						flash(logbuttn, driver);
						
						drawborder(logbuttn, driver);
						
						// to take the screenshot and store it as a file format
						
						//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						
						// now copy the screenshot to desired location using 'copyfile' method
						
						//FileUtils.copyFile(src, new File("C:\\Users\\Vineeth\\eclipse-workspace\\Learnselenium\\src\\selenium"));
						
						
						// generate alert
						
						//generateAlert(driver, "There an issue with login button");
						
						// Click on Login button by using JS executor
						
						ClickElementByJS(logbuttn, driver);
						
						// refresh the page
						
						driver.navigate().refresh();
						
						// to scroll the page
						
						scrollpagedown(driver);
						
						
						

			}
			
			// 'JavascriptExecutor' is a class available in selenium to handle the 'Javascript' codes and we have to Cast our driver into 'JavascriptExecutor'
			
			// What 'JavascriptExecutor' actually doing ???? 
			
			// JavascriptExecutor will hit the javascript library inside the html code directly, it is a very powerfull thing, so it can used when element is not found by xpath.
			
			
			public static void flash(WebElement element, WebDriver driver) {
				
				// Cast our driver into 'JavascriptExecutor'
				
				JavascriptExecutor js = ((JavascriptExecutor) driver);  // casting--- > ((JavascriptExecutor) driver)
				
				String bgcolor = element.getCssValue("backgroundcolor");
				for(int i=0; i<10; i++) {
					
					changecolor("rgb(0,200,0)", element, driver);
					changecolor(bgcolor, element, driver);
				}
				
				
			}
			
			
			public static void changecolor(String color, WebElement element, WebDriver driver) {
				
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("arguments[0].style.backgroundcolor = '"+color+"'", element);
				
				// "executeScript" method is used to execute javascript code
				
				try {
					Thread.sleep(20);
					
				} catch(InterruptedException e) {
					
				}
			}
			
			
			public static void drawborder(WebElement element, WebDriver driver) {
				
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("arguments[0].style.border='3px solid red'", element);
				
			}
			
			
			public static void generateAlert(WebDriver driver, String message) {
				
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("alert('"+message+"')");
				
			}
			
			
			public static void ClickElementByJS(WebElement element, WebDriver driver) {
				
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("arguments[0].click();", element);
				
			}
			
			
			public static void scrollpagedown(WebDriver driver) {
				
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			}

	}

