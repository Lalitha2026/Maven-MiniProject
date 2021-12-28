package org.Mini_Project_Maven;

import java.io.IOException;

import org.basemavenproject.Base_MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;
import org.pom.com.LoginAdact;

public class Project_Maven extends Base_MavenProject {

	public static void main(String[] args) throws InterruptedException, IOException {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Windows\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe");

		driver = browserLaunch("Chrome");

		ChromeOptions ch = new ChromeOptions();

		ch.addArguments("incognito");

//		WebDriver driver = new ChromeDriver(ch);

		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com/index.php");

		LoginAdact la = new LoginAdact(driver);

//		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
//
//		username.sendKeys("Lalithakannan");

		inputvalues(la.getUsername(), "Lalithakannan");

//		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
//
//		pass.sendKeys("Kl@202620");

		inputvalues(la.getPassword(), "Kl@202620");

//		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
//
//		login.click();

		clickOnElement(la.getLogin());

//		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));

//		Select l = new Select(location);
//
//		l.selectByIndex(6);

		dropdown(la.getLocation(), "index", "6");

//		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));

//		Select h = new Select(hotel);
//
//		h.selectByIndex(2);

		dropdown(la.getHotels(), "index", "2");

//		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));

//		Select r = new Select(room);
//
//		r.selectByIndex(3);

		dropdown(la.getRoom(), "index", "3");

//		WebElement numberofrooms = driver.findElement(By.id("room_nos"));

//		Select nr = new Select(numberofrooms);
//
//		nr.selectByIndex(2);

		dropdown(la.getNumberofrooms(), "index", "2");

//		WebElement checkin = driver.findElement(By.name("datepick_in"));

//		checkin.clear();

		cleartheText(la.getCheckin());

//		checkin.sendKeys("28/12/2021");

		inputvalues(la.getCheckin(), "28/12/2021");

//		WebElement checkout = driver.findElement(By.name("datepick_out"));

//		checkout.clear();

		cleartheText(la.getCheckout());

//		checkout.sendKeys("30/12/2021");

		inputvalues(la.getCheckout(), "30/12/2021");

//		WebElement adults = driver.findElement(By.name("adult_room"));

//		Select a = new Select(adults);
//
//		a.selectByIndex(2);

		dropdown(la.getAdults(), "index", "2");

//		WebElement childrens = driver.findElement(By.id("child_room"));

//		Select c = new Select(childrens);
//
//		c.selectByIndex(1);

		dropdown(la.getChildrens(), "index", "1");

//		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
//
//		search.click();

		clickOnElement(la.getSearch());

//		WebElement button = driver.findElement(By.id("radiobutton_0"));
//
//		button.click();

		clickOnElement(la.getButton());

//		WebElement con = driver.findElement(By.xpath("//input[@class='reg_button']"));
//
//		con.click();

		clickOnElement(la.getCon());

//		JavascriptExecutor sc = (JavascriptExecutor) driver;
//
//		Thread.sleep(3000);
//
//		sc.executeScript("window.scrollBy(0,500)");

		scrollby();
		
//		WebElement firstname = driver.findElement(By.name("first_name"));
//
//		firstname.sendKeys("Lalitha");

		inputvalues(la.getFirstname(), "Lalitha");

//		WebElement lastname = driver.findElement(By.id("last_name"));
//
//		lastname.sendKeys("Kannan");

		inputvalues(la.getLastname(), "Kannan");

//		WebElement address = driver.findElement(By.xpath("//textarea[@class='txtarea']"));
//
//		address.sendKeys("331 Park Ave S New York, NY 10010");

		inputvalues(la.getAddress(), "331 Park Ave S New York, NY 10010");

//		WebElement card = driver.findElement(By.id("cc_num"));
//
//		card.sendKeys("4656736928762026");

		inputvalues(la.getCard(), "4656736928762026");

//		WebElement cardtype = driver.findElement(By.id("cc_type"));

//		Select ct = new Select(cardtype);
//
//		ct.selectByIndex(2);

		dropdown(la.getCardtype(), "index", "2");

//		WebElement expmonth = driver.findElement(By.name("cc_exp_month"));

//		Select em = new Select(expmonth);
//
//		em.selectByIndex(6);

		dropdown(la.getExpmonth(), "index", "6");

//		WebElement expyear = driver.findElement(By.id("cc_exp_year"));

//		Select ey = new Select(expyear);
//
//		ey.selectByIndex(12);

		dropdown(la.getExpyear(), "index", "12");

//		WebElement cvv = driver.findElement(By.id("cc_cvv"));

//		cvv.sendKeys("236");
		
		inputvalues(la.getCvv(), "236");

//		WebElement booknow = driver.findElement(By.xpath("//input[@type='button']"));
//
//		booknow.click();

		clickOnElement(la.getBooknow());

//		sc.executeScript("window.scrollBy(0,500)");
//
//		Thread.sleep(5000);
		
		scrollby();

//		WebElement itinerary = driver.findElement(By.xpath("//input[@value='My Itinerary']"));
//
//		itinerary.click();

		clickOnElement(la.getItinerary());

		Thread.sleep(3000);

		takescreenshot("Mavenproject");

//		WebElement logout = driver.findElement(By.id("logout"));
//		
//		logout.click();

		clickOnElement(la.getLogout());

	}
}
