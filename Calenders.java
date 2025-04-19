package com.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calenders {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		Actions actions = new Actions (driver);		
		int day =31;
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
//		driver.findElement(By.id("first_date_picker")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[.="+day+"]")).click();
		driver.findElement(By.id("second_date_picker")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(text(),'ui-priority-secondary'))]/a[.="+day+"]")).click();


	}


}