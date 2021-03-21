package com.automation.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.Book_Hotel;
import com.adactin.pom.Booked_Itinerary;
import com.adactin.pom.Booking_Confirmation;
import com.adactin.pom.Login_Page;
import com.adactin.pom.Search_Hotel;
import com.adactin.pom.Select_Hotel;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private Login_Page login;
	private Search_Hotel search;
	private Select_Hotel select;
	private Book_Hotel book;
	private Booking_Confirmation booking;
	private Booked_Itinerary booked;	
	
	public PageObjectManager(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver, this);
		
	}

	public Login_Page getLogin() {
		
		login = new Login_Page(driver);
		return login;
	}

	public Search_Hotel getSearch() {
		
		search = new Search_Hotel(driver);
		return search;
	}

	public Select_Hotel getSelect() {
		
		select = new Select_Hotel(driver);
		return select;
	}

	public Book_Hotel getBook() {
		
		book = new Book_Hotel(driver);
		return book;
	}

	public Booking_Confirmation getBooking() {
		
		booking = new Booking_Confirmation(driver);
		return booking;
	}

	public Booked_Itinerary getBooked() {
		
		booked = new Booked_Itinerary(driver);
		return booked;
	}

	

	
	

}
