package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class thway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://pathwaylis-qa.ameripath.local/lis/originalindex.jsp");
		//"https://pathwaylis-qa.ameripath.local/lis/originalindex.jsp"
	
		
		
		
		

	}

}
