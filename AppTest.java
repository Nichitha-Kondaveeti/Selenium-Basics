package com.SeleniumPractice;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

	public static void main(String[] args) {
		//to set up manually without webdriver manager
		System.setProperty("webdriver.chrome.driver", "./Resources/chrome-win32");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		// TODO Auto-generated method stub

	}
	
	 
}
