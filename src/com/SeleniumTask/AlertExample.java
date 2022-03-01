package com.SeleniumTask;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.id("alertButton"));
		button.click();

		// simple Alert
		Alert SimpleAlert = driver.switchTo().alert();
		String text = SimpleAlert.getText();
		System.out.println("simpleAlert text is:" + text);
		SimpleAlert.accept();

		// confirm Alert
		WebElement confAlert = driver.findElement(By.id("confirmButton"));
		confAlert.click();
		Alert confirmalert = driver.switchTo().alert();
		String text2 = confirmalert.getText();
		System.out.println("confirmAlert is" + text2);
		// confirmalert.accept();
		confirmalert.dismiss();

		// promptAlert
		WebElement promptAlert = driver.findElement(By.id("promtButton"));
		promptAlert.click();
		Alert alert = driver.switchTo().alert();
		String text3 = alert.getText();
		System.out.println("promptAlert text is:" + text3);
		alert.sendKeys("revathi");
		alert.accept();
		// alert.dismiss();

	}

}
