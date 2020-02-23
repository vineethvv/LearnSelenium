package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropconcept {

	public static void main(String[] args) {
		
		
       System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		// to launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		// to maximize the page
		
		driver.manage().window().maximize();
		
		// to delete all cache/ cookies
		
		driver.manage().deleteAllCookies();
		
		// to launch the url
		
		driver.get("https://jqueryui.com/droppable/");
		
		// switch to frame
		
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
		
		
		

	}

}
