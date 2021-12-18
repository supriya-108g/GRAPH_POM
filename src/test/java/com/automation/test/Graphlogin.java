package com.automation.test;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.automation.pages.Graph;
import com.automation.utils.ExcelDatap;
import com.automation.pages.BaseClass;
import com.automation.pages.Loginp;
import com.automation.pages.QueueOperations;

public class Graphlogin extends BaseClass {

	 
		@Test(priority=0, dataProvider ="SearchProviderone")
		public void testone(String username, String password)
		{

			Loginp login = PageFactory.initElements(driver, Loginp.class);   
			login.loginvalidationn(username, password);
			String actualUrl="https://dsportalapp.herokuapp.com/home";
			String expectedUrl= driver.getCurrentUrl();
			if(actualUrl.equalsIgnoreCase(expectedUrl)) { 
				System.out.println("Test passed");
			} 
			else { 
				System.out.println("Test failed"); 
			}  
			//Assert.assertEquals(actualUrl, expectedUrl);

			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		}
		
		@DataProvider(name="SearchProviderone")
		public Object[][] getdatafromdataproviderone() throws IOException
		{
			Object[][] datafromexcels = ExcelDatap.read("C:\\Users\\Supriya\\eclipse-workspace_202109NN\\POM_Graph\\src\\test\\TestData\\userregister1.xlsx", "Sheet2");
			return datafromexcels;	
		}
		
		@Test(priority=1, dataProvider ="SearchProvidertwo")
		public void testtwo(String Queueprogram) throws InterruptedException
		{

			Graph tab1 = PageFactory.initElements(driver, Graph.class);   
			tab1.tab(Queueprogram);
			Reporter.log("Page url : " +driver.getTitle());
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		}

		@DataProvider(name="SearchProvidertwo")
		public Object[][] getdatafromdataprovidertwo() throws IOException
		{
			Object[][] datafromexcels = ExcelDatap.read("C:\\Users\\Supriya\\eclipse-workspace_202109NN\\POM_Graph\\src\\test\\TestData\\userregister1.xlsx", "Sheet3");
			return datafromexcels;	
		}


	
		// TODO Auto-generated constructor stub
	}

