package com.juniper.pages;

import java.util.Dictionary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	//Verify Juniper   
	@FindBy(xpath="//img[@src='/juniper-sh-qa-c-20/Content/Encor-electronics-logo.png']")
	public WebElement HomePageIcon; 
	
	//Verify Juniper CurrentVersion	
	@FindBy(xpath="//a[@class='navbar-brand']")
	public  WebElement Juniper_Current_Version;
	
	//Defaul HomePAge Icon
	@FindBy(xpath="//ul[@id='homepage-navigation']/li[1]/a")
	public WebElement HomePageMenuBar;
		
	//click on eCQM EH Tab
	
	@FindBy(xpath="//ul[@id='myTab']/li[1]/a")
	public WebElement Click_On_eCQM_EH_Measure_Tab;
	
	//Verify eCQM EH Report Header
	
	@FindBy(xpath="//div[@id='ehRateMeasureResults']/h4")
	public WebElement Header;
	
	//Verify Continoues measiure Header and Print its text
	
	@FindBy(xpath="//div[@id='ehContinuousMeasureResults']/h4")
	public WebElement Continoues_Measure_Header;
	
	//Click on View eCQM EH Report
	
	@FindBy(xpath="//div[@id='ecqm']/a")
	public WebElement ClickON_View_EH_Report;
		
	//Click On Objective EH Tab and Print its text
	@FindBy(xpath="//ul[@id='myTab']/li[2]/a")
	public WebElement Click_On_EH_ObjectiveMeasure_Tab;
	
	//Print Objective  EH Header 
	@FindBy(xpath="//div[@id='ehFunctionalMeasureResults']/h4")
	public WebElement Objective_EH;
			
	//click on Objective EH  Report
	@FindBy(xpath="//div[@id='functional']/a")
	public WebElement Click_on_Objective_EH_Report;
		
	//Click on Quality Measrue EC
	@FindBy(xpath="//ul[@id='myTab']/li[4]/a")
	public WebElement Click_ON_Quality_Measure_EC;
	
	//Clcik on Quality Measrue EC Clinicain Rate 
	@FindBy(xpath="//ul[@id='epECQMTab']/li[1]/a")
	public WebElement Clinician_Rates;
	
	//Click On View Quality Measure Report for EC 
	@FindBy(xpath="//div[@id='epECQMTabContent']/a")
	public WebElement Clinician_View_MIPS_Quality_Measures_Report;
	
	//Clcik on Quality Measure Ec Measure Rate tab
	@FindBy(xpath="//ul[@id='epECQMTab']/li[2]/a")
	public WebElement Ec_Measure_Rates_tab;
	
	//View Quality Measure Rate Report
	@FindBy(xpath="//div[@id='epECQMTabContent']/a")
	public WebElement Rate_View_MIPS_Quality_Measures_Report;
		
	//Click on IA Measure
	@FindBy(xpath="//ul[@id='myTab']/li[5]/a")
	public WebElement IA_Measure;
	
	@FindBy(xpath="//div[@id='iaMeasureResults']/h4")
	public WebElement IAMeasureHeader;
	
	//Clck on IA Measure View Improvement Activites Implementation
	@FindBy(xpath="//div[@id='mipsIA']/a")
	public WebElement Click_ON_VIAI_Report;
	
	//Click On ACI EC Measure Tab
	@FindBy(xpath="//ul[@id='myTab']/li[6]/a")
	public WebElement Click_on_IA_Tab;
	
	//Print Header Name ACIEC
	@FindBy(xpath="//div[@id='aciMeasureResults']/h4")
	public WebElement ACIECHeader;
	
	//Click on MIPS_ACI_EC_Report
	@FindBy(xpath="//div[@id='mipsAci']/a")
	public WebElement MIPS_ACI_EC_Report;
	
	
	//click on Submission Schedule tab
	@FindBy(xpath="//ul[@id='myTab']/li[7]/a")
	public WebElement Click_On_Submission_Schedule_tab;
	
	//Submission page Eligible Hospitals - 2017 eCQM Submission Schedule
	@FindBy(xpath="//div[@id='submissionSchedule']/h4[1]")
	public WebElement eCQM_Submission_Schedule;
	
	//Verify Name of Hospital Label
	@FindBy(xpath="//span[@id='hospitalSelectionSection']/span")
	public WebElement HospitalLabel;
	
	//Click On Hospital Dropdown
	@FindBy(xpath="//select[@id='hospitalId']")
	public WebElement PEL_Hospital_DropDown;
	
	//Verifiy Default PEL Hospital is Selected 
	@FindBy(xpath="//select[@id='hospitalId']/option[@value='2']")
	public WebElement PEL_Hospital;
	
	//Verify PEL_PHYS hospital selected 
	@FindBy(xpath="//select[@id='hospitalId']/option[@value='3']")
	public WebElement PEL_PHYS;
	
	//Verify Quarter labelName
	
	@FindBy(xpath="//span[@id='quarterSelectionSection']/span")
	public WebElement QuarterlabelName;
	
	//Select QuarterDropDown
	
	@FindBy(xpath="//select[@id='quarterSelection']")
	public WebElement Select_QuarterDropDown;
	
	//Verify the List of QuarterItem
	@FindBy(xpath="//select[@id='quarterSelection']")
	public WebElement Select_QuarterDropDownList;
	
	//Verify the Default Quarter Selection
	@FindBy(xpath="//select[@id='quarterSelection']/option[3]")
	public WebElement NewQuarterValue;
	
	@FindBy(xpath="//select[@id='quarterSelection']/option[2]")
	public WebElement DefaultQuarterValue;
	
}
