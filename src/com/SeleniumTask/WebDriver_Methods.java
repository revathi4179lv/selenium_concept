package com.SeleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/");

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("title is:" + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url is:" + currentUrl);

		driver.navigate().to("https://www.google.com/");

		driver.navigate().back();
		System.out.println("before url is :" + driver.getTitle());

		driver.navigate().forward();
		System.out.println("after url is :" + driver.getTitle());

		driver.navigate().refresh();

		driver.quit();

	}

}
