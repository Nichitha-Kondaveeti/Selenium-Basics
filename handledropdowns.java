package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handledropdowns {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		
		// selecting single value drop down
		
//		WebElement CourseName = driver.findElement(By.id("course"));
//		Select CourseNametxt = new Select (CourseName);
//		List<WebElement> CourseNametxtoptions = CourseNametxt.getOptions();
//		for (WebElement options : CourseNametxtoptions) {
//			System.out.println(options.getText());
//		}
//		CourseNametxt.selectByIndex(2);
//		Thread.sleep(3000);
//		CourseNametxt.selectByValue("js");
//		Thread.sleep(3000);
//		CourseNametxt.selectByVisibleText("Python");
//		Thread.sleep(3000);
//		
//		String selectedtxt = CourseNametxt.getFirstSelectedOption().getText();
//		System.out.println("firstselectedtxt-" + selectedtxt );
//		
		
	}

}
