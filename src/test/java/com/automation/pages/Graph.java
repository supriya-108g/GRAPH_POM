package com.automation.pages;






import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Graph {
	WebDriver driver;
	JavascriptExecutor js;
	public Graph(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
		this.js=(JavascriptExecutor)this.driver;
	}
	//Select dropdown
	@FindBy(xpath = "//a[@data-toggle='dropdown']" ) WebElement dropdown ; 
	//store the values and select
	@FindBy(xpath="//a[@class='dropdown-item']")  List<WebElement> allDropDownValues;
	//select graph link
	@FindBy(xpath="//a[@href='graph']")WebElement graph;
	@FindBy(xpath="//li[@class='list-group-item list-group-item-light ']")WebElement graphlink;
	//select tryhere
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement tryeditor;
	@FindBy(css="#answer_form > div > div > div:nth-child(1) > textarea") WebElement textarea;
	@FindBy(xpath="//form[@id='answer_form']/button")WebElement run;
	@FindBy(css="body > div:nth-child(2) > ul:nth-child(9) > a")WebElement GraphRepresentationslink;
	@FindBy(xpath="//*[@id=\"content\"]/li[2]/a")WebElement GraphRepresentations;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/a")WebElement practiceExams;
	@FindBy(xpath="//a[@href='/logout']")WebElement signout;
	@FindBy(xpath="//div[@class='alert alert-primary']")WebElement signoutmsg;

	public void tab(String Queueprogram)throws InterruptedException {
		//Finding the count of all elements
		dropdown.click();

		int dropDownCount= allDropDownValues.size();

		//Printing count of all items
		System.out.println("Total items present in the dropdown : "+dropDownCount);

		//For loop to go each and every element in the dropdown
		for(int i=0;i<dropDownCount;i++)
		{
			//if condition to check specific element "queue"
			if(allDropDownValues.get(i).getText().contains("Graph"))
			{

				//Clicking the desired element
				allDropDownValues.get(i).click();
				//Stop continuing the loop as we already found the desired element
				break;

			}
		}


		graph.click();
		graphlink.click();
		js.executeScript("window.scrollBy(0,800)");
		tryeditor.click();
		textarea.sendKeys(Queueprogram);
		run.click();
		driver.navigate().back();
		GraphRepresentations.click();
		js.executeScript("window.scrollBy(0,900)");
		tryeditor.click();
		textarea.sendKeys(Queueprogram);
		run.click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
		
		GraphRepresentationslink.click();
		graphlink.click();
		tryeditor.click();
		textarea.sendKeys(Queueprogram);
		run.click();
		driver.navigate().back();
		GraphRepresentations.click();
		js.executeScript("window.scrollBy(0,900)");
		tryeditor.click();
		textarea.sendKeys(Queueprogram);
		run.click();
		driver.navigate().back();
		
		practiceExams.click();
		driver.navigate().back();
		signout.click();

		//js.executeScript("window.scrollBy(0,-700)");
		Thread.sleep(2000);

	}

}