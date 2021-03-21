package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement first_Name;
	
	@FindBy(id="last_name")
	private WebElement last_Name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement creditcard_Number;
	
	@FindBy(id="cc_type")
	private WebElement creditcard_Type;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiry_Month;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiry_Year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv_Number;
	
	@FindBy(id="book_now")
	private WebElement book_Btn;

	public Book_Hotel(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcard_Number() {
		return creditcard_Number;
	}

	public WebElement getCreditcard_Type() {
		return creditcard_Type;
	}

	public WebElement getExpiry_Month() {
		return expiry_Month;
	}

	public WebElement getExpiry_Year() {
		return expiry_Year;
	}

	public WebElement getCvv_Number() {
		return cvv_Number;
	}

	public WebElement getBook_Btn() {
		return book_Btn;
	}
	
	

}
