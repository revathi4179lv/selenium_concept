package com.SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		// singleFrame
		driver.switchTo().frame("singleframe");
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("TextBox1");
		driver.switchTo().defaultContent();

		// multiFrame
		WebElement multi = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		multi.click();
		WebElement outerbox = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerbox);
		WebElement innerbox = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerbox);
		WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
		text1.sendKeys("TextBox2");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

	}

}
