package com.SeleniumTask;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_Example {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver1\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		// large interface
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		driver.manage().window().maximize();
		// takesScreenshot - small interface
		TakesScreenshot ts = (TakesScreenshot) driver; // narrow typecasting -large to low
		// getScreenshotAs - method used to take screenshot
		// file class
		File shot = ts.getScreenshotAs(OutputType.FILE);
		// location
		File store = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\screenshot\\greens.png");
		// copy the file to the required location
		FileUtils.copyFile(shot, store);

	}

}
