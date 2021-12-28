package org.pom.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAdact {
	
	public static WebDriver driver;

	// driver.findElement(by.)// @FindBy

	@FindBy(xpath = "//input[@type='text']")

	private WebElement username;

		@FindBy(xpath = "//input[@name='password']")

	private WebElement pass;

	@FindBy(xpath = "//input[@value='Login']")

	private WebElement login;
	
	@FindBy(xpath = "//select[@id='location']")

	private WebElement location;
	
	@FindBy(xpath = "//select[@name='hotels']")

	private WebElement hotels;
	
	@FindBy(xpath = "//select[@name='room_type']")

	private WebElement room;
	
	@FindBy(id = "room_nos")

	private WebElement numberofrooms;
	
	@FindBy(name = "datepick_in")

	private WebElement checkin;
	
	@FindBy(name = "datepick_out")

	private WebElement checkout;
	
	@FindBy(name = "adult_room")

	private WebElement adults;
	
	@FindBy(id = "child_room")

	private WebElement childrens;
	
	@FindBy(xpath = "//input[@type='submit']")

	private WebElement search;
	
	@FindBy(id = "radiobutton_0")

	private WebElement button;
	
	@FindBy(xpath = "//input[@class='reg_button']")

	private WebElement con;
	
	@FindBy(name = "first_name")

	private WebElement firstname;
	
	@FindBy(id = "last_name")

	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@class='txtarea']")

	private WebElement address;
	
	@FindBy(id = "cc_num")

	private WebElement card;
	
	@FindBy(id = "cc_type")

	private WebElement cardtype;
	
	@FindBy(name = "cc_exp_month")

	private WebElement expmonth;
	
	@FindBy(id = "cc_exp_year")

	private WebElement expyear;
	
	@FindBy(id = "cc_cvv")

	private WebElement cvv;
	
	@FindBy(xpath = "//input[@type='button']")

	private WebElement booknow;
	
	@FindBy(xpath = "//input[@value='My Itinerary']")

	private WebElement itinerary;
	
	@FindBy(id = "logout")

	private WebElement logout;
	

	public LoginAdact (WebDriver driver2) {
		
		this.driver = driver2; // to confirm both class drivers are same 
		PageFactory.initElements(driver2, this);// is a class to access the current class elements. it help to reduce the code duplication and improves the test case maintenance
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return pass;
	}
	
	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildrens() {
		return childrens;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getCon() {
		return con;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getLogout() {
		return logout;
	}
}