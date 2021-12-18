package com.automation.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.WebDriver;


public class Loginp {
	WebDriver driver;
	//constructor
public Loginp(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@href='/login']" ) WebElement Login;
	 
	@FindBy(name = "username" ) WebElement id_username2;
	@FindBy(name = "password" ) WebElement firstpassword2;
	
	@FindBy(xpath="//input[@value='Login']") WebElement login;
	
	
			

	public void loginvalidationn(String username, String password)
	{
		Login.click();

		id_username2.sendKeys(username);
		Reporter.log("Username value is entered");

		//Enter the value for Password
		firstpassword2.sendKeys(password);
		Reporter.log("Password value is entered");  
		
		
		login.click();
		Reporter.log("ConfirmRegister value is entered"); 
		


	}




}


