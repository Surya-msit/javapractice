package karthik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kathik {
	public static void main(String[] args) {
		
		// System Property for ChromeDriver   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maree\\Downloads\\chromedriver_win\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();
        
        //driver.quit();
		//Invoking browser
		// seleniumManager
		//what is interface in java?An interface is a group of related methods with empty bodies.
		//it is responsible for  implements the methods declared in the interface
		//ChromeDriver driver = new ChromeDriver(); 
		//this chromeDriver may not access other browser,if it access personal ChromeDriver
		//driver object here has access to all the methods of ChromeDriver
		
		//webDriver driver = new ChromeDriver():
		//webDriver is interface
		//diver object here has access to the methods of ChromeDriver which are defined in web driver
		
		//ChromeDriver.exe
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\maree\\Downloads\\chromedriver_win");
		//WebDriver driver = new ChromeDriver();
		
	}

}
