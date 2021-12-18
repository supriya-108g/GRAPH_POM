package com.automation.pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
//import pagefactory.Loginp;
//import pagefactory.loginpage_register_signin;
import com.automation.utils.ExcelDatap;

//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;

import com.automation.utils.BrowserFactory;

public class BaseClass {
	
 public WebDriver driver;
//	 Userregister register_sigin;
//	 Loginp login;
//	 ExcelDatap Excel;
	
	
	 @BeforeClass
		public void beforeClass()throws Exception
		{  
			//driver = BrowserFactory.startApplication(driver, "Chrome", "https://dsportalapp.herokuapp.com/");
		    driver = BrowserFactory.startApplication(driver, "Firefox", "https://dsportalapp.herokuapp.com/");
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Reporter.log("Welcome to DS-Algo Home page");  
		}

 
  
// @AfterMethod()
//  public void aftermethod(ITestResult result) throws IOException
//  {
//  if(ITestResult.FAILURE==result.getStatus())
//  {
//	 // TakesScreenshot scrShot=((TakesScreenshot)driver);
//  String srcfilepath = ".\\DS-Algo\\Screenshots"+result.getName()+".PNG";
//  TakesScreenshot scrsht = ((TakesScreenshot)driver);
//  File SrcFile = scrsht.getScreenshotAs(OutputType.FILE);
//  File DestnFile = new File("srcfilepath");
//  FileUtils.copyFile(SrcFile, DestnFile);
//  //logger.log(Status.FAIL, "The Title of the webpage is not as expected, please find the Snapshot attached below: " + logger.addScreenCaptureFromPath(filepath));
//  }
//  }
  
  @AfterClass
	public void afterClass() 
	{
		BrowserFactory.quitBrowser(driver);
	}
 
}