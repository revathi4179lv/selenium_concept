package com.selenium.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoPracti {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// signin button
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		Thread.sleep(3000);
		// mailid enter
		WebElement mailid = driver.findElement(By.id("email_create"));
		mailid.sendKeys("revathi4179@gmail.com");
		// createbutton
		WebElement createbut = driver.findElement(By.id("SubmitCreate"));
		createbut.click();

		// gender - radio button
		WebElement gender = driver.findElement(By.xpath("(//label[@class='top'])[2]"));
		gender.click();

		// firatname
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("Revathi");
		// lastname
		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("M");
		// password
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("revathim7");
		// date of birth
		WebElement date = driver.findElement(By.id("days"));
		Select s = new Select(date);
		s.selectByValue("31");
		WebElement month = driver.findElement(By.id("months"));
		Select s1 = new Select(month);
		s1.selectByValue("3");
		WebElement year = driver.findElement(By.id("years"));
		Select s2 = new Select(year);
		s2.selectByValue("1995");
		// address
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("no.2, big street");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("slab city");
		WebElement state = driver.findElement(By.id("id_state"));
		Select s3 = new Select(state);
		s3.selectByValue("5");
		WebElement pincode = driver.findElement(By.id("postcode"));
		pincode.sendKeys("92233");
		WebElement country = driver.findElement(By.id("id_country"));
		Select s4 = new Select(country);
		s4.selectByValue("21");
		// phone
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("9035234681");
		// mobile
		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		mobile.sendKeys("9035234681");
		// address nother
		WebElement addes = driver.findElement(By.id("alias"));
		addes.sendKeys("2, big Street");
		// register
		WebElement reg = driver.findElement(By.id("submitAccount"));
		reg.click();

	}

}
