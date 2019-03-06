package com.juniper.pages;
//Test GITHUB

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Administration_Page {
	@FindBy(xpath="//*[@id='homepage-navigation']/li[5]/a")
	public WebElement AdministrationClick;
	
	//Test  
	@FindBy(xpath="//a[@href='/juniper-sh-qa-c-20/Administration/Users']")
	public WebElement UserAdministrationClick;
	
	@FindBy(xpath="//input[@class='ui-autocomplete-input ui-widget ui-widget-content ui-corner-left']")
	public WebElement UserAdministrationTextbox;
	
	@FindBy(xpath="//ul[@id='homepage-navigation']/li[5]")
	public WebElement Adm_MenuList;

	@FindBy(xpath="//ul[@id='homepage-navigation']/li[5]/ul/li[10]")
	public WebElement MIPSSelect;
	
	@FindBy(xpath="//ul[@id='homepage-navigation']/li[5]/ul/li[10]/ul")
	public WebElement MIPS;
	
	@FindBy(xpath="//ul[@id='homepage-navigation']/li[5]/ul/li[10]/ul/li[11]")
	public WebElement EPQRDAImport;
	
		
}
