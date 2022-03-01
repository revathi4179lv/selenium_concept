package com.selenium.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Browser_Launch {
	/**
	 * @param args
	 * @throws IOException
	 * @throws Throwable
	 */
	public static void main(String[] args) throws IOException, Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	driver.get("http://www.greenstechnologys.com/index.html");
		// driver.manage().window().maximize();
		// WebElement sc = driver.findElement(By.xpath("//span[text()='Greens Technology
		// Tambaram']"));
		// JavascriptExecutor js=(JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();", sc);
		// Thread.sleep(2000);
		// TakesScreenshot ts=(TakesScreenshot) driver;
		// File sdc = ts.getScreenshotAs(OutputType.FILE);
		// File ds=new
		// File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\screenshot\\tech.png");
		// FileUtils.copyFile(sdc, ds);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement number = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		number.sendKeys("7092101296");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("maddymani");
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		Thread.sleep(2000);

		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("iphone");
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File as = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\screenshot\\filpkart.png");
		FileHandler.copy(as, des);

	}

}
