package com.SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("revathi4179@gmail.com");

		boolean selected = id.isSelected();
		System.out.println("is selected:" + selected);

		id.clear();

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("omprakash06");

		String attribute = password.getAttribute("name");
		System.out.println("attribute name is:" + attribute);

		String attribute2 = password.getAttribute("value");
		System.out.println("attribute value is:" + attribute2);

		boolean displayed = password.isDisplayed();
		System.out.println("is displayed:" + displayed);

		boolean enabled = password.isEnabled();
		System.out.println("is enabled:" + enabled);

		WebElement login = driver.findElement(By.name("login"));
		login.click();

		driver.quit();

	}

}
