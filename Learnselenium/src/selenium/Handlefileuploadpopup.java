package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlefileuploadpopup {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar files\\chrome driver\\chromedriver.exe");
		
		// to launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		// to launch the url
		
		driver.get("https://html.com/input-type-file/");
		
		// to maximize the page
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		// click on 'choose file' button
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("D:\\ISO\\SQL Presentation.pptx");
		

	}

}
