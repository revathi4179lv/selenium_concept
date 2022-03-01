package com.SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown_Example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement number = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		number.sendKeys("7092101296");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("maddymani");
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();

		Thread.sleep(2000);
		WebElement scroll = driver.findElement(By.xpath("//span[text()='Mail Us:']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -2000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 5000);");
		Thread.sleep(2000);
		WebElement scrollclick = driver.findElement(By.xpath("//img[@alt='Grocery']"));
		js.executeScript("arguments[0].click();", scrollclick);

	}

}
