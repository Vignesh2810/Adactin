package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement room_Type;
	
	@FindBy(id = "room_nos")
	private WebElement room_Nos;
	
	@FindBy(id = "datepick_in")
	private WebElement checkIn;
	
	@FindBy(id = "datepick_out")
	private WebElement checkOut;
	
	@FindBy(id = "adult_room")
	private WebElement adultRoom;
	
	@FindBy(id = "child_room")
	private WebElement childRoom;
	
	@FindBy(id = "Submit")
	private WebElement submit;

	public Search_Hotel(WebDriver driver2) {

		this .driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getRoom_Nos() {
		return room_Nos;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
}
