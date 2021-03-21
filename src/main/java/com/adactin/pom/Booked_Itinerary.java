package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
	
	public static WebDriver driver;
	
	@FindBy(id = "check_all")
	private WebElement order_id;
	
	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancel_selected_Btn;
	
	@FindBy(id = "logout")
	private WebElement logout_Btn;

	public Booked_Itinerary(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getOrder_id() {
		return order_id;
	}

	public WebElement getCancel_selected_Btn() {
		return cancel_selected_Btn;
	}

	public WebElement getLogout_Btn() {
		return logout_Btn;
	}
	

}
