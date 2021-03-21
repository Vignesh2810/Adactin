Feature: Hotel Booking in Adactin Application

Scenario:

	Given user Launches The Application
	When user Enters The Username In The Username Field
	And user Enters The Password In The Password Field
	Then user Clicks  On The Login Button And It Navigates To The Search Hotel Page


Scenario:
	When user Selects The Location
	And user Selects The Hotel
	And user Selects The Room Type
	And user Selects The Number Of Rooms
	And user Enters The Check In Date In The Check In Date Field 
	And user Enters The Check Out Date In The Check Out Date Field
	And user Selects The Adults Per Room 
	And user Selects The Children Per Room
	Then user Clicks The Search Button It Navigates To The Select Hotel Page 
	

Scenario:
	When user Clicks The Select Button  
	And user Clicks The Continue Button It Navigates To The Book A Hotel Page 
	

Scenario:
	When user Enters The First Name In The First Name Field 
	And user Enters The Last Name In The Last Name Field 
	And user Enters The Billing Address In the Billing Address Field
	And user Enters The Credit Card Number In the Credit Card Number Field 
	And user Selects The Credit Card Type
	And user Selects The Expiry Month
	And user Selects The Expiry Year 
	And user Enters The CVV Number In The CVV Number Field 
	Then user Clicks The Book Now Button It Navigates To The Booking Confirmation Page
		
	
Scenario:
	
	When user Scrolls Down The Page
	Then user Clicks On The My Itinerary Button And Navigates To Booked Itinerary Page
	
	
Scenario:
	When user Checks The Checkbox Next To Order Id And Selects All The Bookings
	And user Clicks On The Cancel Selected Button 
	And user Clicks On The Cancel Button In The Alert Pop Up
	Then user Clicks on The Logout Button 	
	

