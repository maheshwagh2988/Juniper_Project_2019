package com.juniper.suite;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.juniper.pages.HomePage;
import com.juniper.pages.ReporHMPatientList;
import com.juniper.suite.TestFramWork;
import com.juniper.utility.ConfigBaseClass;
public class TestReportPage extends TestFramWork{
	
	@Test
	public void Report() throws InterruptedException {
		
			ReporHMPatientList Repo = PageFactory.initElements(driver, ReporHMPatientList.class);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			Repo.Click_on_Reporting.click();
			Repo.Click_on_Reporting.getText();
			String Rep=Repo.Click_on_Reporting.getText();
			//System.out.println("My Expected Text is: "+mytext);
			Assert.assertEquals(Rep,"Reporting","NotMatch");
			System.out.println("Reporting  Tab Header name Print Sucessfully: 	" + Rep);
			
			
			WebElement Repoelement= Repo.Click_on_Reporting;
			Select RepodropDown = new Select(Repoelement);
			List<WebElement> e2 = RepodropDown.getOptions();
			int itemCount1 = e2.size();

			for(int l = 0; l < itemCount1; l++)
			{
			    System.out.println(e2.get(l).getText());
			}
			
			String PrintRepor=Repo.Click_on_Reporting.getText();
			System.out.println("Reporting Menu List print successfully: 	" + PrintRepor);
			
	}
	
	
}