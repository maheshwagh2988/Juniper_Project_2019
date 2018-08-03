package com.juniper.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReporHMPatientList {
	//Click on Reporting Main Menu
	@FindBy(xpath="//ul[@id='homepage-navigation']/li[2]/a")
	public WebElement Click_on_Reporting;
	
	@FindBy(xpath="//a[@href='#' and contains(text(),'Hospital Measures')]")
	public WebElement EHHompitalMeasure;
	
	@FindBy(xpath="//a[@href='/juniper-sh-qa-c-20/Reporting/PatientList' and contains (text(),'Patient List')]")
	public WebElement EHPatientList;
//	
	@FindBy(xpath="//h1[@class='panel-title']")
	public WebElement EHPatientListTitle;
	
	@FindBy(id="reportrangetext")
	public WebElement DefaultDateRange;
	
//	@FindBy(xpath="//*[@id='ReportingStartDate']")
//	public WebDriver EHRepoStartDate;
//	
//	@FindBy(xpath="//*[@id='ReportingEndDate']")
//	public WebDriver EHRepoEndDate;
	
	@FindBy(xpath="//img[@src='/juniper-sh-qa-c-20/Content/images/icon-settings.png']")
	public WebElement GareWheelMenu;
	
	@FindBy(xpath="//a[@class='detail-img']")
	public WebElement FieldList;
	
//	@FindBy(xpath="//td[@id='patientListGrid_custwindow_col12']")
	public WebElement dragHicID;
	
	
}
