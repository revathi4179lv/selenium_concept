package com.selenium.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinProject {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("revathimuthu");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("revathi7");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("London");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select sel = new Select(hotel);
		sel.selectByValue("Hotel Cornice");
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select se = new Select(roomtype);
		se.selectByValue("Double");
		WebElement nos = driver.findElement(By.id("room_nos"));
		Select st = new Select(nos);
		st.selectByValue("2");
		WebElement from = driver.findElement(By.xpath("//input[@value='09/02/2022']"));
		from.sendKeys("09/02/2022");
		WebElement to = driver.findElement(By.xpath("//input[@value='10/02/2022']"));
		to.sendKeys("10/02/2022");
		WebElement adltroom = driver.findElement(By.id("adult_room"));
		Select sl = new Select(adltroom);
		sl.selectByValue("2");
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select sele = new Select(childroom);
		sele.selectByValue("1");
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		WebElement radiobut = driver.findElement(By.xpath("//input[@type='radio']"));
		radiobut.click();
		WebElement conti = driver.findElement(By.id("continue"));
		conti.click();
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("revathi");
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("muthu");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("1, bigstrret,london");
		WebElement crditcrd = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		crditcrd.sendKeys("1234567812345678");
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select sc = new Select(cctype);
		sc.selectByValue("VISA");
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select sd = new Select(expmonth);
		sd.selectByValue("3");
		WebElement ccyear = driver.findElement(By.id("cc_exp_year"));
		Select sr = new Select(ccyear);
		sr.selectByValue("2022");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("1234");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		WebElement myiti = driver.findElement(By.id("my_itinerary"));
		myiti.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screen = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\screenshot\\hotel.png");
		FileUtils.copyFile(screen, des);

	}
}
