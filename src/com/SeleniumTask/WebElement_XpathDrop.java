package com.SeleniumTask;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement_XpathDrop {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement signup = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		signup.click();
		Thread.sleep(2000);

		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("pragadi");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("lvg");

		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("pragadi345@gmail.com");

		WebElement remail = driver.findElement(By.name("reg_email_confirmation__"));
		remail.sendKeys("pragadi345@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'password_step')]"));
		password.sendKeys("123456789");

		WebElement date = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s = new Select(date);
		s.selectByValue("28");

		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByIndex(3);

		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select y = new Select(year);
		y.selectByVisibleText("2019");

	}

}
