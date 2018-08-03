package com.juniper.utility;
 

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ConfigBaseClass {
	
	// Initilaze the property file
	public static Properties CONFIG = null;
	public static Properties OR = null;
	public static WebDriver dr = null;
	public static EventFiringWebDriver driver = null;

	@BeforeMethod
	public static void beforeClass() throws Exception {
		initialize();
		 

	}

	@AfterMethod
	public static void afterClass() throws Exception {
		quit();
	}

	public static void initialize() throws Exception {
		if (driver == null) {
			// config property file
			CONFIG = new Properties();
			FileInputStream fn = new FileInputStream(System.getProperty("user.dir")+ "//src//config//config.porperties");
			CONFIG.load(fn);

//			// OR propperty
//			OR = new Properties();
//			fn = new FileInputStream(System.getProperty("user.dir")	+ "//src//config//OR.properties");
//			OR.load(fn);

			// Initalize web driver and event firing
			 WebDriver dr = null;
			if (CONFIG.getProperty("browser").equals("Firefox")) {
				dr = new FirefoxDriver();
			} else if (CONFIG.getProperty("browser").equals("IE")) {
				System.setProperty("webdriver.ie.driver", "D:/Automation/IEDriverServer.exe");
				dr = new InternetExplorerDriver();
			}
			else  if (CONFIG.getProperty("browser").equals("Chrome")){
				System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
				dr = new ChromeDriver();
			}
			
			
			dr.get(CONFIG.getProperty("url"));
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			if (dr != null) {
				driver = new EventFiringWebDriver(dr);
				driver.manage().timeouts().implicitlyWait(50l, TimeUnit.SECONDS);
			}
		}
	}

	protected static void quit() throws Exception {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
		if (dr != null) {
			dr.quit();
			dr = null;
		}

		OR = null;
		CONFIG = null;
	}

	public static WebElement getObject(String xpathvalKey) {
		try {
			return driver.findElement(By.xpath(OR.getProperty(xpathvalKey)));
		} catch (Throwable t) {
			// report an error
			return null;
		}
	}

	public static void assertTrue(String string, boolean elementPresent) {

	}

	protected boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
