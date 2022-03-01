package com.selenium.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoPractise1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='login']")).click();

		WebElement mailId = driver.findElement(By.id("email"));
		mailId.sendKeys("revathi4179@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("revathim7");
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		driver.findElement(By.xpath("(//a[text()='Dresses'])[2]")).click();
		WebElement imgg = driver.findElement(By.xpath("(//img[@class='replace-2x'])[2]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(imgg).build().perform();
		ac.click(imgg).build().perform();
		WebElement dress = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive']"));
		ac.moveToElement(dress).build().perform();
		ac.click(dress).build().perform();
		WebElement butt = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		ac.moveToElement(butt).build().perform();
		ac.click(butt).build().perform();
		driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
		WebElement firsts = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", firsts);
		firsts.click();
		WebElement seconds = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		js.executeScript("arguments[0].scrollIntoView();", seconds);
		seconds.click();
		WebElement thrids = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		js.executeScript("arguments[0].scrollIntoView();", thrids);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		thrids.click();
		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File ds = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\screenshot\\project.png");
		FileUtils.copyFile(ss, ds);

	}

}
