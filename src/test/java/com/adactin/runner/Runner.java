package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin_baseclass.BaseClass;
import com.automation.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src//test//java//com//adactin//feature", glue ="com.adactin.stepdefinition")


public class Runner{
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable {
		
		//driver = getDriver("chrome");
		
		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		
		driver = BaseClass.getDriver(browser);
	}
	
	//@AfterClass
	//public static void close() {
		
	//driver.close();
	//}

}
