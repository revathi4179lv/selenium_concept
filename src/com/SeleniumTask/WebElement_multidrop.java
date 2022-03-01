package com.SeleniumTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement_multidrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		WebElement multi = driver.findElement(By.xpath("(//select)[2]"));
		Select s = new Select(multi);
		// ismultiple
		boolean check = s.isMultiple();
		System.out.println("is multiple:" + check);
		System.out.println();
		s.selectByVisibleText("Skim Milk");
		s.selectByIndex(5);
		s.selectByValue("sugar");
		s.selectByValue("muffin");

		// deselected
		s.deselectByValue("skim");
		s.deselectByVisibleText("A muffin");
		s.deselectByIndex(4);
		// s.deselectAll();

		// getOptions
		System.out.println("all options:");
		List<WebElement> op = s.getOptions();
		for (WebElement dd : op) {
			System.out.println(dd.getText());
		}
		System.out.println();
		// getAllSelectedOptions
		System.out.println("all selected options are:");
		List<WebElement> alll = s.getAllSelectedOptions();
		for (WebElement selected : alll) {
			System.out.println(selected.getText());
		}
		// firstselectedoption
		System.out.println();
		System.out.println("First Selected Option is:");
		WebElement firstSelected = s.getFirstSelectedOption();
		System.out.println(firstSelected.getText());

	}

}
