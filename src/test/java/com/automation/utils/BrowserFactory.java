package com.automation.utils;

import java.util.concurrent.TimeUnit;
//import Util.ExcelDataProvider ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
	
	//Start the Application
		 public static WebDriver startApplication(WebDriver driver, String browsername, String appurl)throws Exception
		 {
		  System.out.println("url: " + appurl);
		  
		  if(browsername.equals("Chrome"))
		  {
		   //System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		  //   driver = new ChromeDriver();
		  }
		  else if(browsername.equalsIgnoreCase("Firefox")){
				//set path to chromedriver.exe
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Supriya\\eclipse-workspace_202109NN\\POM_Graph\\Driver\\geckodriver.exe");
				//create chrome instance
				driver = new FirefoxDriver();
			}
		//Check if parameter passed as 'Edge'
			else if(browsername.equalsIgnoreCase("Edge")){
				//set path to Edge.exe
				System.setProperty("webdriver.edge.driver",".\\MicrosoftWebDriver.exe");
				//create Edge instance
				driver = new EdgeDriver();
			}
	else{
		//If no browser passed throw exception
		throw new Exception("Browser is not correct");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		  //Launch url
		  driver.get(appurl); 
		  
		   //To maximize the browser
		    driver.manage().window().maximize();
		    //Reporter.log("Page is scrolled by pixel");
		    
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   //  Thread.sleep(2000);  
		  
		  return driver;
		  
		 }
		 
		 
		 
		 //To Close the Browser
		 public static void quitBrowser(WebDriver driver) 
		 {
		  driver.close();
		  driver.quit();
		 }
		
		

}