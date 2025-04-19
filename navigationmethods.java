package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigationmethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("APjFqb")).sendKeys("hello");
		driver.findElement(By.id("APjFqb")).submit();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("nichitha@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).clear();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.close();
		
		
		

	}

}
