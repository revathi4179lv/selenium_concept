package com.selenium.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@class='login']")).click();

		WebElement emaild = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		emaild.sendKeys("revathi4179@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("revathim7");

		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();

		driver.findElement(By.xpath("(//a[text()='Dresses'])[2]")).click();

		WebElement causal = driver.findElement(By.xpath("(//img[@class='replace-2x'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(causal).build().perform();
		a.click(causal).build().perform();

		WebElement printed = driver.findElement(By.xpath("(//img[@title='Printed Dress'])"));
		a.moveToElement(printed).build().perform();
		a.click(printed).build().perform();
		// JavascriptExecutor js=(JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000);");
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("size is:" + size);
		driver.switchTo().frame(0);
		WebElement addtocart = driver.findElement(By.xpath("(//button[@class='exclusive'])"));
		JavascriptExecutor j = (JavascriptExecutor) driver;

		j.executeScript("arguments[0].click();", addtocart);
		driver.switchTo().defaultContent();
		WebElement proceedTo = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		j.executeScript("arguments[0].click();", proceedTo);
		WebElement summarys = driver
				.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		j.executeScript("arguments[0].click();", summarys);
		WebElement addrsss = driver.findElement(By.xpath("//button[@name='processAddress']"));
		j.executeScript("window.scrollBy(0,2000);");
		j.executeScript("arguments[0].click();", addrsss);

		WebElement agree = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		j.executeScript("window.scrollBy(0,2000);");
		j.executeScript("arguments[0].click();", agree);
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();

//		driver.findElement(By.xpath("//a[@class='logn']")).click();
//		
//		WebElement mailId = driver.findElement(By.id("email"));
//		mailId.sendKeys("revathi4179@gmail.com");
//		WebElement pass = driver.findElement(By.id("passwd"));
//		pass.sendKeys("revathim7");
//		WebElement login = driver.findElement(By.id("SubmitLogin"));
//		login.click();
//		
//		driver.findElement(By.xpath("(//a[text()='Dresses'])[2]")).click();
//		driver.findElement(By.xpath("(//img[@class='replace-2x'])[2]")).click();
//		  
//		  Actions act=new Actions(driver);
//		  WebElement add = driver.findElement(By.xpath("//img[@itemprop='image']"));
//		  act.moveToElement(add).build().perform();
//		  WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
//		  cart.click();
//		  
//
//		  WebElement check = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
//		  JavascriptExecutor js=(JavascriptExecutor) driver;
//		  js.executeScript("arguments[0].click();", check);
//		  
//		  driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
//		  driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
//		  driver.findElement(By.id("cgv")).click();
//		  driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]")).click();
//		  driver.findElement(By.xpath("//a[@class='cheque']")).click();
//		  driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();  

	}
}
