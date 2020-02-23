package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpouphandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		// to launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		// to launch the url
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// to maximize the page
		
		driver.manage().window().maximize();
		
		
		// Click on sign in button
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		//  switch to alert popup
		
		Alert alert = driver.switchTo().alert();
		
		// to print the text on the alert popup
		
        System.out.println(alert.getText());	
        
        // to verify whether alert mgs displayed is correct or not
        
        String text = alert.getText();
        
        if(text.equals("Please enter a valid user name")) {
        	
        	System.out.println("correct alert mesg");
        }
        
        else {
        	
        	System.out.println("Incorrect alert msg");
        }
		
       // to click on 'OK" button
        
        alert.accept();


	}

}
