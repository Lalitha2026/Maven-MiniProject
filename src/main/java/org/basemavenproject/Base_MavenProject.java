package org.basemavenproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_MavenProject {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Windows\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		return driver;

	}

	public static void dropdown(WebElement ele, String value, String i) {
		Select s = new Select(ele);
		if (value.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}

		else if (value.equals("text")) {
			s.selectByVisibleText(value);
		}

		else if (value.equals("index")) {
			s.selectByIndex(Integer.parseInt(i));
		}
	}

	public static void clickOnElement(WebElement element) {

		element.click();
		
	}
	
	public static void cleartheText(WebElement element) {
		element.clear();

	}
	
	
	public static void inputvalues(WebElement element, String s) {

		element.sendKeys(s);
	}
	
	public static void scrollby() throws InterruptedException {
		
		JavascriptExecutor sc = (JavascriptExecutor) driver;

		sc.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(5000);

	}
	
	public static void takescreenshot(String screenshot) throws IOException {

	TakesScreenshot tk = (TakesScreenshot) driver;

	File source = tk.getScreenshotAs(OutputType.FILE);

	File destination = new File("C:\\Users\\Windows\\eclipse-workspace\\MiniProject\\Screenshot\\Mavenproject.png"); // object
																													// creation
	FileUtils.copyFile(source, destination);
	
	}
}