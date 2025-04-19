package com.SeleniumPractice;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseactions {

	/**
	 * @param args
	 * @throws Exception 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		
		
		actions.moveToElement(driver.findElement(By.xpath("(//body//a)[2]"))).click().perform();
		actions.moveToElement(driver.findElement(By.xpath("(//nav[@class='oxd-topbar-body-nav']//li)[3]"))).click().perform();	
		actions.moveToElement(driver.findElement(By.linkText("Locations"))).click().perform();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Narsapuram");
		driver.findElement(By.xpath("(//label[text()='City']/following::input)[1]")).sendKeys("nichitha");
		actions.sendKeys(Keys.TAB).perform();
		Thread.sleep(5000);
		actions.doubleClick().perform();
		
		
//		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//		
//		actions.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
//		driver.findElement(By.xpath("//span[.='Edit']")).click();
//		Alert alerts = driver.switchTo().alert();
//		alerts.accept();
//		
	
		
		
		
			
			
		
		
		driver.close();
		
		
	}

}
