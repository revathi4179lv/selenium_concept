package com.SeleniumTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelemnt_Multi {
	// multiple dropdown for single dropdown
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createbut = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createbut.click();
		Thread.sleep(2000);
		WebElement multi = driver.findElement(By.id("day"));
		// ismultiple
		Select s = new Select(multi);
		boolean date = s.isMultiple();
		System.out.println("is multipledropdown:" + date);
		// getOption
		List<WebElement> op = s.getOptions();
		for (WebElement all : op) {
			String text = all.getText();
			System.out.println(text);
		}
		s.selectByValue("7");
		s.selectByVisibleText("10");
		// getAllSelectedOption
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allselect : allSelectedOptions) {
			String text1 = allselect.getText();
			System.out.println("allSelectedOption is:" + text1);

		}
		// getFirstSelectedOption
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text3 = firstSelectedOption.getText();
		System.out.println("FirstSelectedText is:" + text3);

		// deselect
		// s.deselectByVisibleText("10");//Throw exception
		s.deselectAll();

	}

}
