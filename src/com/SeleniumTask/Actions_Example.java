package com.SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Example {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// click and movetoElement
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		WebElement spt = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(spt).build().perform();
		Thread.sleep(2000);
		WebElement wg = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		ac.click(wg).build().perform();

		// right click and double click

		driver.navigate().to("https://demoqa.com/buttons");
		WebElement rgtclk = driver.findElement(By.id("rightClickBtn"));
		ac.contextClick(rgtclk).build().perform();
		WebElement dubclk = driver.findElement(By.id("doubleClickBtn"));
		ac.doubleClick(dubclk).build().perform();

		// drag and drop
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		// bank drag
		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		// account in debit
		WebElement account1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		// 5000 in debit
		WebElement amount1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		// amount
		WebElement value1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

		// sales drag
		WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		// account in credit
		WebElement account2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		// 5000 in credit
		WebElement amount2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		// amount in credit side
		WebElement value2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

		ac.dragAndDrop(bank, account1).build().perform();
		ac.dragAndDrop(amount1, value1).build().perform();
		ac.dragAndDrop(sales, account2).build().perform();
		ac.dragAndDrop(amount2, value2).build().perform();

	}

}
