package com.SeleniumTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class window_handles {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement tdy = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		Actions ac = new Actions(driver);
		ac.contextClick(tdy).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement nr = driver.findElement(By.xpath("(//a[@class='nav-a  '])[8]"));
		ac.contextClick(nr).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		// getwindowhandles
		Set<String> wh = driver.getWindowHandles();
		for (String id : wh) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}
		String mytitle = "Amazon.in Hot New Releases: The bestselling new and future releases on Amazon";
		for (String id : wh) {
			if (driver.switchTo().window(id).getTitle().equals(mytitle)) {
				break;
			}
		}

	}

}
