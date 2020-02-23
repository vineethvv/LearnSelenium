package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorconcept {

	public static void main(String[] args) throws InterruptedException {
		
			
		
        System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		// to launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		// to launch the url
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// to maximize the page
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		// Switching to frame
		
		driver.switchTo().frame("frame-one1434677811");
		
		
		//1. xpath--- 2
		
		// absolute x path should not be used
		
		// only relative xpath should be used
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("vinu");
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-2']")).sendKeys("vineeth");
		
		//2. id---- 1
		
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("7736651200");
		
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("goooo");
		
		//3. name---- 3
		
		
		driver.findElement(By.name("RESULT_TextField-5")).sendKeys("tvm");
		
		driver.findElement(By.name("RESULT_TextField-6")).sendKeys("vineeth.g773@gmail.com");
		
		// Switching to parent frame or defaut content
		
		driver.switchTo().parentFrame();
		
		
		//4. linktext---> only for links
		
		
		driver.findElement(By.linkText("Posts (Atom)")).click();
		
		
		//5. partiallinktext---- this not useful to use
		
		//6. cssselector---- 2
		
		//driver.findElement(By.cssSelector("#RESULT_TextField-6")).sendKeys("aaa");
		
		//7. classname---- this not useful to use --- 4

	}

}
