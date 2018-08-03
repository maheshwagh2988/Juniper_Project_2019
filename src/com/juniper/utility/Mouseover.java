package com.juniper.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.juniper.pages.Administration_Page;


public class Mouseover {
	public static void HoverAndClick(WebDriver driver1,WebElement elementToHover,WebElement elementToClick) {
		Actions action = new Actions(driver1);
		action.moveToElement(elementToHover).click(elementToClick).build().perform();
	}
	
	
}
