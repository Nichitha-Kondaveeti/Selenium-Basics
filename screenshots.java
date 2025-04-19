package com.SeleniumPractice;

import java.awt.List;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.databind.Module.SetupContext;
import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshots {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		///Thread.sleep(3000);
		
//		driver.get("https://www.google.com/");
		
		
		// File
//		File sourcefile = driver.getScreenshotAs(OutputType.FILE);
//		File destfile = new File("./screenshots/img1.jpg");
//		FileUtils.copyFile(sourcefile, destfile);
//		driver.close();
//		
		//Byte
//		byte[] sourcefile = driver.getScreenshotAs(OutputType.BYTES);
//		File destfile = new File("./screenshots/img2.jpg");
//		FileOutputStream fos = new FileOutputStream(destfile);
//		fos.write(sourcefile);
//		
//		System.out.println("screenshot saved");
//		driver.close();
		
		//Base64
//		String sourcefile = driver.getScreenshotAs(OutputType.BASE64);
//		byte[] conbyte = Base64.getDecoder().decode(sourcefile);
//		File destfile = new File("./screenshots/img3.jpg");
//		FileOutputStream fos = new FileOutputStream(destfile);
//		fos.write(conbyte);
//		fos.close();
//		
//		System.out.println("screenshot saved");
//		
		
		
		//////webdriver instance
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		String sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//		byte[] conbyte = Base64.getDecoder().decode(sourcefile);
//		File destfile = new File("./screenshots/img4.jpg");
//		FileOutputStream fos = new FileOutputStream(destfile);
//		fos.write(conbyte);
//		fos.close();
//		
//		System.out.println("screenshot saved");
		
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement course = driver.findElement(By.id("course"));
		Select coursename = new Select(course);
		coursename.selectByIndex(3);
		
		
		
		driver.close();
				
		

	}

	
		
	}


