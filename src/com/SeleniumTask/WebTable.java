package com.SeleniumTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		System.out.println("All data");
		List<WebElement> AllData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : AllData) {
			String text = all.getText();
			System.out.println(text);
		}
		System.out.println();
		System.out.println("Row Data");
		List<WebElement> RowData = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		for (WebElement rowss : RowData) {
			String text1 = rowss.getText();
			System.out.println(text1);
		}
		System.out.println();
		System.out.println("column Data");
		List<WebElement> ColumnData = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		for (WebElement clns : ColumnData) {
			String text2 = clns.getText();
			System.out.println(text2);
		}
		System.out.println();
		System.out.println("particular Data");
		WebElement parti = driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]"));
		String text3 = parti.getText();
		System.out.println(text3);

		System.out.println();
		System.out.println("header");
		List<WebElement> headers = driver.findElements(By.tagName("th"));
		for (WebElement hd : headers) {
			String text4 = hd.getText();
			System.out.println(text4);
		}

	}

}
