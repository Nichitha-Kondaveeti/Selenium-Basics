package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlebasicHTMLcontrols {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		
		WebElement hindicheckbox = driver.findElement(By.id("hindichbx"));
		hindicheckbox.click();// check
		Thread.sleep(3000);
		if(hindicheckbox.isSelected())
			hindicheckbox.click();
		Thread.sleep(3000);
		
		
			
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		Thread.sleep(3000);
		driver.close();
		 
		
			
		
		
		
		// TODO Auto-generated method stub

	}

}
