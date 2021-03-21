package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Runner;
import com.adactin_baseclass.BaseClass;
import com.automation.helper.Configuration_Reader;
import com.automation.helper.FileReaderManager;
import com.automation.helper.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass{
	
	public static WebDriver driver = Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^user Launches The Application$")
	public void user_Launches_The_Application() throws Throwable {
		
		//getUrl("https://adactinhotelapp.com/");
		
		FileReaderManager.getInstance().getInstanceCR();
		String url = Configuration_Reader.getUrl();
		getUrl(url);
		
	    }

	@When("^user Enters The Username In The Username Field$")
	public void user_Enters_The_Username_In_The_Username_Field() throws Throwable {
		
		//inputElement(login.getUsername(), "Vignesh2810");
		
		inputElement(pom.getLogin().getUsername(), "Vignesh2810");
		
	    }

	@When("^user Enters The Password In The Password Field$")
	public void user_Enters_The_Password_In_The_Password_Field() throws Throwable {
		
		//inputElement(login.getPassword(), "qwerty123");
		
		inputElement(pom.getLogin().getPassword(), "qwerty123");
		
	    }

	@Then("^user Clicks  On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Clicks_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		
		//click(login.getlogin_Btn());
		
		click(pom.getLogin().getlogin_Btn());
		Thread.sleep(3000);
		
	    }
	
	@When("^user Selects The Location$")
	public void user_Selects_The_Location() throws Throwable {
		
		//dropDown(search.getLocation(), "byVisibleText", "Sydney");
		
		dropDown(pom.getSearch().getLocation(), "byVisibleText", "Sydney");
		
	    }

	@When("^user Selects The Hotel$")
	public void user_Selects_The_Hotel() throws Throwable {
	    
		//dropDown(search.getHotels(), "byVisibleText", "Hotel Creek");
		
		dropDown(pom.getSearch().getHotels(), "byVisibleText", "Hotel Creek");
		
	}

	@When("^user Selects The Room Type$")
	public void user_Selects_The_Room_Type() throws Throwable {
	    
		//dropDown(search.getRoom_Type(), "byVisibleText", "Standard");
		
		dropDown(pom.getSearch().getRoom_Type(), "byVisibleText", "Standard");
		
	}

	@When("^user Selects The Number Of Rooms$")
	public void user_Selects_The_Number_Of_Rooms() throws Throwable {
	    
		//dropDown(search.getRoom_Nos(), "byVisibleText", "1 - One");
		
		dropDown(pom.getSearch().getRoom_Nos(), "byVisibleText", "1 - One");
		
	}
	
	@When("^user Enters The Check In Date In The Check In Date Field$")
	public void user_Enters_The_Check_In_Date_In_The_Check_In_Date_Field() throws Throwable {
	    
		//inputElement(search.getCheckIn(), "06/02/2021");
		
		inputElement(pom.getSearch().getCheckIn(), "06/02/2021");
		
	}

	@When("^user Enters The Check Out Date In The Check Out Date Field$")
	public void user_Enters_The_Check_Out_Date_In_The_Check_Out_Date_Field() throws Throwable {
	    
		//inputElement(search.getCheckOut(), "07/02/2021");
		
		inputElement(pom.getSearch().getCheckOut(), "07/02/2021");
		
	}

	@When("^user Selects The Adults Per Room$")
	public void user_Selects_The_Adults_Per_Room() throws Throwable {
	    
		//dropDown(search.getAdultRoom(), "byVisibleText", "1 - One");
		
		dropDown(pom.getSearch().getAdultRoom(), "byVisibleText", "1 - One");
		
	}

	@When("^user Selects The Children Per Room$")
	public void user_Selects_The_Children_Per_Room() throws Throwable {
	    
		//dropDown(search.getChildRoom(), "byVisibleText", "0 - None");
		
		dropDown(pom.getSearch().getChildRoom(), "byVisibleText", "0 - None");
		
	}

	@Then("^user Clicks The Search Button It Navigates To The Select Hotel Page$")
	public void user_Clicks_The_Search_Button_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
	    
		//click(search.getSubmit());
		
		click(pom.getSearch().getSubmit());
		
	}

	@When("^user Clicks The Select Button$")
	public void user_Clicks_The_Select_Button() throws Throwable {
		
		//click(select.getSelect());
		
		click(pom.getSelect().getSelect());
	    
	}

	@When("^user Clicks The Continue Button It Navigates To The Book A Hotel Page$")
	public void user_Clicks_The_Continue_Button_It_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {
	    
		//click(select.getContinue_Btn());
		
		click(pom.getSelect().getContinue_Btn());
		
	}
	
	@When("^user Enters The First Name In The First Name Field$")
	public void user_Enters_The_First_Name_In_The_First_Name_Field() throws Throwable {
	    
		//inputElement(book.getFirst_Name(), "Vigneshwar");
		
		inputElement(pom.getBook().getFirst_Name(), "Vigneshwar");
		
	}

	@When("^user Enters The Last Name In The Last Name Field$")
	public void user_Enters_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
	    
		//inputElement(book.getLast_Name(), "K");
		
		inputElement(pom.getBook().getLast_Name(), "K");
	}

	@When("^user Enters The Billing Address In the Billing Address Field$")
	public void user_Enters_The_Billing_Address_In_the_Billing_Address_Field() throws Throwable {
	    
		//inputElement(book.getAddress(), "GKM Colony");
		
		inputElement(pom.getBook().getAddress(), "GKM Colony");
		
	}

	@When("^user Enters The Credit Card Number In the Credit Card Number Field$")
	public void user_Enters_The_Credit_Card_Number_In_the_Credit_Card_Number_Field() throws Throwable {
	    
		//inputElement(book.getCreditcard_Number(), "1234567891011123");
		
		inputElement(pom.getBook().getCreditcard_Number(), "1234567891011123");
		
	}

	@When("^user Selects The Credit Card Type$")
	public void user_Selects_The_Credit_Card_Type() throws Throwable {
	    
		//dropDown(book.getCreditcard_Type(), "byVisibleText", "American Express");
		
		dropDown(pom.getBook().getCreditcard_Type(), "byVisibleText", "American Express");
		
	}

	@When("^user Selects The Expiry Month$")
	public void user_Selects_The_Expiry_Month() throws Throwable {
	    
		//dropDown(book.getExpiry_Month(), "byVisibleText", "January");
		
		dropDown(pom.getBook().getExpiry_Month(), "byVisibleText", "January");
		
	}

	@When("^user Selects The Expiry Year$")
	public void user_Selects_The_Expiry_Year() throws Throwable {
	    
		//dropDown(book.getExpiry_Year(), "byVisibleText", "2012");
		
		dropDown(pom.getBook().getExpiry_Year(), "byVisibleText", "2012");
		
	}

	@When("^user Enters The CVV Number In The CVV Number Field$")
	public void user_Enters_The_CVV_Number_In_The_CVV_Number_Field() throws Throwable {
	    
		//inputElement(book.getCvv_Number(), "123");
		
		inputElement(pom.getBook().getCvv_Number(), "123");
		
	}

	@Then("^user Clicks The Book Now Button It Navigates To The Booking Confirmation Page$")
	public void user_Clicks_The_Book_Now_Button_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
		
		//click(book.getBook_Btn());
		
		click(pom.getBook().getBook_Btn());
		Thread.sleep(3000);
	    
	}
	
	@When("^user Scrolls Down The Page$")
	public void user_Scrolls_Down_The_Page() throws Throwable {
	    
	scroll(pom.getBooking().getSearch_hotel());
		
	}
	
	

	@Then("^user Clicks On The My Itenary Button And Navigates To Booked Itinerary Page$")
	public void user_Clicks_On_The_My_Itenary_Button_And_Navigates_To_Booked_Itinerary_Page() throws Throwable {
	    
		click(pom.getBooking().getMy_itenary());
		
	}
	
	@When("^user Checks The Checkbox Next To Order Id And Selects All The Bookings$")
	public void user_Checks_The_Checkbox_Next_To_Order_Id_And_Selects_All_The_Bookings() throws Throwable {
	    
		click(pom.getBooked().getOrder_id());	
		
	}

	@When("^user Clicks On The Cancel Selected Button$")
	public void user_Clicks_On_The_Cancel_Selected_Button() throws Throwable {
	    
		click(pom.getBooked().getCancel_selected_Btn());
		
	}

	@When("^user Clicks On The Cancel Button In The Alert Pop Up$")
	public void user_Clicks_On_The_Cancel_Button_In_The_Alert_Pop_Up() throws Throwable {
	    
		alerts();
		
	}

	@Then("^user Clicks on The Logout Button$")
	public void user_Clicks_on_The_Logout_Button() throws Throwable {
	    
		click(pom.getBooked().getLogout_Btn());
		
	}



	
	

	




	
}
