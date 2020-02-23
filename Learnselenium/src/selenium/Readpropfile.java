package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Readpropfile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
        Properties prop = new Properties();
		
		// fileinputstream class will connect to the config.properties file
		
		// fileinputstream class will create an inputstream b/w our java code & config.properties file
		
		//once is inputstream is stabilized b/w our java code & config.properties file , we have to load the particular file
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Vineeth\\eclipse-workspace\\Learnselenium\\src\\selenium\\config.properties");

		// to load the file by using properties, to load the file we have to use the object name 'prop'
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
	    String url = prop.getProperty("URL");
	    
	    System.out.println(url);
	    
	    String browsername = prop.getProperty("browser");
	    
	    System.out.println(browsername);
	    
	    if(browsername.equals("chrome")){
	    
	    
        System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		// to launch the browser
		
		driver = new ChromeDriver();
		
	    // to maximize the page
		
		driver.manage().window().maximize();
		
		
	    }else if(browsername.equals("firefox")) {
	    	
	    	 System.setProperty("webdriver.chrome.driver", "E:\\selenium jar files\\chrome driver\\geckodriver.exe");
	    	 
	    	 driver = new FirefoxDriver();
	    }
	    
	    driver.get(url);
	    
	    // switch to frame
	    
	    driver.switchTo().frame(0);
	    
	    // calling the xpath & passing the data
	    
	    driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
	    
	    driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
		
		

	}

}
