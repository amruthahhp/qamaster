package com.qamaster;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class LoactorsPractice {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		WebElement username = driver.findElement(By.id("inputUsername"));
		WebElement password = driver.findElement(By.name("inputPassword"));
		WebElement signIn = driver.findElement(By.className("signInBtn"));
		username.sendKeys("amrutha");
		password.sendKeys("password");
		signIn.click();
		Thread.sleep(3000);
		// Using Cssselector 
		// 1. tagname.classname
		// 2. tagname#id
		//3. tagname[attribute='value'] (use this if there is no ID or className available)
		WebElement element = driver.findElement(By.cssSelector("p.error"));
		Assert.assertEquals(element.getText(), "* Incorrect username or password");	
	}
		
	}
