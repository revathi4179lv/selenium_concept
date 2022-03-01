package com.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {
	static int IndexOfNew, IndexOfTot;
	static String country;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		List<WebElement> allheader = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		// index -header
		for (int i = 0; i < allheader.size(); i++) {
			String text = allheader.get(i).getText();
			// System.out.println(text);
			String header = text.replace("\n", " ");
			// System.out.println(header);
			if (header.equalsIgnoreCase("New Cases")) {
				IndexOfNew = i;
				System.out.println("Index value Of New Cases:" + IndexOfNew);

			} else if (header.equalsIgnoreCase("Tot Cases/ 1M pop")) {
				IndexOfTot = i;
				System.out.println("Index of TotCases:" + IndexOfTot);
			}
		}
		List<WebElement> allRow = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));

		for (int i = 0; i < allRow.size(); i++) {
			List<WebElement> allData = allRow.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < allData.size(); j++) {
				if (allData.get(j).getText().equalsIgnoreCase(country)) {
					System.out.println("NEw Case:" + allData.get(IndexOfNew).getText());
					System.out.println("TotCase:" + allData.get(IndexOfTot).getText());

				}
			}

		}

	}

}
