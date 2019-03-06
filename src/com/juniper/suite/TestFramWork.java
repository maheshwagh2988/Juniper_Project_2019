package com.juniper.suite;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.text.DateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.IIOException;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.juniper.pages.Administration_Page;
import com.juniper.pages.HomePage;
import com.juniper.pages.ReporHMPatientList;

import org.testng.TestListenerAdapter;

import com.juniper.utility.ConfigBaseClass;

import com.juniper.utility.DateComparison;
import com.juniper.utility.Mouseover;

public class TestFramWork extends ConfigBaseClass {
	
	@Test
	public void Test1() {

		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("EncorE"));
						
	}
	@Test
	public void Test2() throws InterruptedException {
		
//			HomePage hp = PageFactory.initElements(driver, HomePage.class);
//			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//			Assert.assertEquals(hp.HomePageIcon.getAttribute("src"),"http://ms-qa-c/juniper-sh-qa-c-20/Content/Encor-electronics-logo.png","Actual img is not expected");
//			System.out.println(hp.HomePageIcon.getAttribute("src"));
		
		HomePage hp= PageFactory.initElements(driver, HomePage.class);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Assert.assertEquals(hp.HomePageIcon.getAttribute("src"),"http://ms-qa-c/juniper-sh-qa-c-20/Content/Encor-electronics-logo.png","Actual img is not expected");
		System.out.println(hp.HomePageIcon.getAttribute("src"));
		
	}
	
	@Test
	public void Test3() throws InterruptedException{
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(2000);
		String tooltip =(hp.Juniper_Current_Version.getAttribute("title"));
		System.out.println("The ToolTip for Juniper Application Version is : "+tooltip);
			
	}
	@Test
	public void Test4()throws InterruptedException{
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		hp.Click_On_eCQM_EH_Measure_Tab.click();
				
		//VerifyHomePageEHTab  Update
		hp.Click_On_eCQM_EH_Measure_Tab.click();
		String mytext=hp.Click_On_eCQM_EH_Measure_Tab.getText();
		//System.out.println("My Expected Text is: "+mytext);
		Assert.assertEquals(mytext,"eCQM EH", "NotMatch");
		System.out.println(mytext);
		System.out.println("eCQM EH Tab Header name Print Sucessfully: 	" + mytext);
		
		//Verify EH Measure Header
		hp.Header.getText();
		String ehHeadertxt=hp.Header.getText();
		Assert.assertEquals(ehHeadertxt,"Rate Measures For Q1 2018 (EH)", "NotMatch");
		System.out.println(ehHeadertxt);
		System.out.println("eCQM EH Tab Specification Version Print Sucessfully: 	" + ehHeadertxt);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Verify Continues Measure Header
		
		hp.Continoues_Measure_Header.getText();
		String ehContinuousMeasureResults=hp.Continoues_Measure_Header.getText();
		Assert.assertEquals(ehContinuousMeasureResults,"Continuous Measures For Q1 2018 (EH)", "NotMatch");
		System.out.println(ehContinuousMeasureResults);
		System.out.println("EH Continuous Measure Results Tab Print Sucessfully: 	" + ehContinuousMeasureResults);
		
		//ClickonEHReport
		
		hp.ClickON_View_EH_Report.click();
			
						
		//HomePage Nevegation
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		hp.HomePageMenuBar.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		String HomMenu=hp.HomePageMenuBar.getText();
		System.out.println("Home Page Nevigation work Sucessfully: "+HomMenu);
		
		//VerifyHospitalLabel
		
		hp.HospitalLabel.getText();
		String Hosmytext=hp.HospitalLabel.getText();
		Assert.assertEquals(Hosmytext,"Hospital:", "NotMatch");
		System.out.println(Hosmytext);
		System.out.println("Hosptial Label Name is Print successfully:  	" + Hosmytext);
		
		//VerifyHosDropDown+
		Select dropDown = new Select(hp.PEL_Hospital_DropDown);
		List<WebElement> e = dropDown.getOptions();
		int itemCount = e.size();

		for(int l = 0; l < itemCount; l++)
		{
		    System.out.println(e.get(l).getText());
		}
		
		//Verify_Hos_DefaultValue
		
		Select HDrodown = new Select(hp.PEL_Hospital_DropDown);
		//HDrodown.selectByValue("3");
		//System.out.println(HDrodown);
		Thread.sleep(4000);
		HDrodown.selectByValue("2");
		String PelHospil=hp.PEL_Hospital_DropDown.getText();
		System.out.println("Hosptial dropDown Values are print successfully: 	" + PelHospil);
		
				
		//PrintQuarterDropValues
		WebElement element= hp.Select_QuarterDropDownList;
		Select dropDown1 = new Select(element);
		List<WebElement> e1 = dropDown1.getOptions();
		int itemCount1 = e1.size();

		for(int l = 0; l < itemCount1; l++)
		{
		    System.out.println(e1.get(l).getText());
		}
		
		String PrintQuar=hp.Select_QuarterDropDownList.getText();
		System.out.println("Quarter DropDown Value are Display successfully: 	" + PrintQuar);
	
	}
	
	@Test
	public void Test5(){
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		hp.Click_On_EH_ObjectiveMeasure_Tab.click();
		String FunEH=hp.Click_On_EH_ObjectiveMeasure_Tab.getText();
		Assert.assertEquals(FunEH,"Objective EH", "NotMatch");
		System.out.println(FunEH);
		System.out.println("Functional EH Tab Header name Print Sucessfully: 	" + FunEH);
		
		hp.Objective_EH.getText();
		String FunEHReport=hp.Objective_EH.getText();
		System.out.println(FunEHReport);
		Assert.assertEquals(FunEHReport,"EH Objective Measures For Period Q1 2018", "NotMatch");
		System.out.println("Functional EH Tab Specification Version Print Sucessfully: 	" + FunEHReport);
		hp.Click_on_Objective_EH_Report.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hp.HomePageMenuBar.click();
			
	}
	@Test
	public void Test6(){
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hp.Click_ON_Quality_Measure_EC.click();
		String MIPS=hp.Click_ON_Quality_Measure_EC.getText();
		System.out.println(MIPS);
		System.out.println("MIPS Score Page works Sucessfully: 	" + MIPS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		hp.Clinician_Rates.click();
		String ClRate=hp.Clinician_Rates.getText();
		System.out.println(ClRate);
		System.out.println("Clinician Rate Tab Select Sucessfully: 	" + ClRate);
		hp.Clinician_View_MIPS_Quality_Measures_Report.click();
		hp.HomePageMenuBar.click();
		hp.Click_ON_Quality_Measure_EC.click();
		hp.Ec_Measure_Rates_tab.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hp.Ec_Measure_Rates_tab.click();
		String MRated=hp.Ec_Measure_Rates_tab.getText();
		System.out.println(MRated);
		System.out.println("Measure Rate Tab Select Sucessfully: 	" + MRated);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		hp.Rate_View_MIPS_Quality_Measures_Report.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		hp.HomePageMenuBar.click();
		
		
	}
	@Test
	public void Test7(){
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		hp.IA_Measure.click();
		String CARate=hp.IA_Measure.getText();
		System.out.println(CARate);
		System.out.println("IA Measure Tab Select Sucessfully: 	" + CARate);
		
		//hp.IA_Measure.getText();
		String IAReport=hp.IAMeasureHeader.getText();
		System.out.println(IAReport);
		Assert.assertEquals(IAReport,"Improvement Activities Implementation for 01/01/2017 to 12/31/2017", "NotMatch");
		System.out.println("IA Measure Tab Specification Version Print Sucessfully: 	" + IAReport);
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		hp.Click_ON_VIAI_Report.click();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		hp.HomePageMenuBar.click();
				
	}
		
	@Test
	public void Test8(){
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		
		hp.Click_on_IA_Tab.click();
		String ACIEC=hp.Click_on_IA_Tab.getText();
		System.out.println(ACIEC);
		System.out.println("ACI EC Measure Tab Select Sucessfully: 	" + ACIEC);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
					
		String ACI_EC=hp.ACIECHeader.getText();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		Assert.assertEquals(ACI_EC,"ACI Transition Measures For Period Q1 2018", "NotMatch");
		System.out.println(ACI_EC);
		System.out.println("ACI EC Tab Header name Print Sucessfully: 	" + ACI_EC);
				
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		hp.MIPS_ACI_EC_Report.click();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		hp.HomePageMenuBar.click();
		
		
	}
	@Test
	public void Test9(){
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
							
		hp.Click_On_Submission_Schedule_tab.click();
		String SubTesxt=hp.Click_On_Submission_Schedule_tab.getText();
		Assert.assertEquals(SubTesxt,"Submission Schedule", "NotMatch");
		System.out.println(SubTesxt);
		System.out.println("Submission Schedule Tab Print Sucessfully: 	" + SubTesxt);
				
		//Print Eligible Hospitals - 2017 eCQM Submission Schedule
		String Submission_Schedule=hp.eCQM_Submission_Schedule.getText();
		Assert.assertEquals(Submission_Schedule,"Eligible Hospitals - 2017 eCQM Submission Schedule", "NotMatch");
		System.out.println(Submission_Schedule);
		System.out.println("Submission Schedule Tab Print Sucessfully: 	" + Submission_Schedule);
		
		}
	
		
}
