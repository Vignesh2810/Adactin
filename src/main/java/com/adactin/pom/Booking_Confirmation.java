package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
	
	public static WebDriver driver;
	
	@FindBy(id = "my_itenary")
	private WebElement my_itenary;
	
	@FindBy(id = "search_hotel")
	private WebElement search_hotel;
	
	public Booking_Confirmation(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	
	public WebElement getMy_itenary() {
		return my_itenary;
	}


	public WebElement getSearch_hotel() {
		return search_hotel;
	}


	
	
	
	

}
