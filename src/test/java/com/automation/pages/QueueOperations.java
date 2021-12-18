package com.automation.pages;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueueOperations {
	WebDriver driver;
	JavascriptExecutor js1;

	public QueueOperations(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
		this.js1=(JavascriptExecutor)this.driver;
	}
	
	
			@FindBy(xpath = "//a[@data-toggle='dropdown']" ) WebElement dropdown ; 
			@FindBy(xpath="//a[@class='dropdown-item']")  List<WebElement> allDropDownValues;
			 @FindBy(xpath="//a[@href='QueueOp']")WebElement implement4;
		     @FindBy(xpath="//a[@href='/queue/implementation-lists/']")WebElement queueimplement;
		     @FindBy(xpath="//a[@href='/tryEditor']")WebElement tryeditor;
		     @FindBy(css="#answer_form > div > div > div:nth-child(1) > textarea") WebElement textarea;
		     @FindBy(xpath="//form[@id='answer_form']/button")WebElement run;

		     @FindBy(xpath="//a[@href='/queue/implementation-collections/']")WebElement collections;
		     @FindBy(xpath="//a[@href='/queue/Implementation-array/']")WebElement Implementarray;
		     @FindBy(xpath="//a[@href='/queue/QueueOp/']")WebElement QueueOperations;
		     @FindBy(xpath="//a[@href='/queue/practice']")WebElement practiceExams;
		     @FindBy(xpath="//a[@href='/logout']")WebElement signout;
		     public void dropdown4(String Queueprogram)throws InterruptedException
		     {
		    	 dropdown.click();
		 		
		 		int dropDownCount= allDropDownValues.size();
		 		
		 		//Printing count of all items
		 		System.out.println("Total items present in the dropdown : "+dropDownCount);
		 	//WebElement a =driver.findElement(By.xpath("//a[@href='/queue']"));
		 		//For loop to go each and every element in the dropdown
		 		for(int i=0;i<dropDownCount;i++)
		 		{
		 			 //if condition to check specific element "queue"
		 			if(allDropDownValues.get(i).getText().contains("Queue"))
		 			{
		 				
		 				//Clicking the desired element
		 				allDropDownValues.get(i).click();
		 				//Stop continuing the loop as we already found the desired element
		 				break;
		 				
		 				
		 			}
		 		}
		 		
		 		
		 		js1.executeScript("window.scrollBy(0,1000)");
		    		implement4.click();
		    		queueimplement.click();
		    		tryeditor.click();
		    		textarea.sendKeys(Queueprogram);
		    		run.click();
		    		driver.navigate().back();
		    		collections.click();
		    		tryeditor.click();
		    		textarea.sendKeys(Queueprogram);
		    		run.click();
		    		driver.navigate().back();
		    		Implementarray.click();
		    	//	js.executeScript("window.scrollBy(0,900)");
		    		tryeditor.click();
		    		textarea.sendKeys(Queueprogram);
		    		run.click();
		    		driver.navigate().back();
		    		QueueOperations.click();
		    		tryeditor.click();
		    		textarea.sendKeys(Queueprogram);
		    		run.click();
		    		driver.navigate().back();
		    		practiceExams.click();
		    		signout.click();
		    		//js.executeScript("window.scrollBy(0,-700)");
		    		Thread.sleep(2000);
		    		
		     }

		}



