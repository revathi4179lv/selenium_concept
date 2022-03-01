package com.SeleniumTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {
	static int IndexOfNew, IndexOfTot;
	static String country;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\driver1\\chromedriver.exe");
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
		// body
		// all row
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> aldat = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < aldat.size(); j++) {
				if (aldat.get(j).getText().equalsIgnoreCase(country)) {
					System.out.println("New cases:" + aldat.get(IndexOfNew).getText());
					System.out.println("Totcase:" + aldat.get(IndexOfTot).getText());
				}

//				
//			}
			}

		}

	}

}
