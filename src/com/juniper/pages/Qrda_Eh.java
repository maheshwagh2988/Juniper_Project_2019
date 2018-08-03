package com.juniper.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Qrda_Eh {
	
	@FindBy(className="//a[@href='/juniper-sh-qa-c-20/Data/EPQrdaExport']")
	public WebElement SelectAdminPage; 
	
	@FindBy(xpath="//a[@href='/juniper-sh-qa-c-20/Data/EPQrdaExport']")
	public WebElement SelectECPage; 
	
	
	

}
