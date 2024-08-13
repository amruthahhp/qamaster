package com.qamaster;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class LoactorsPractice {
	
	public static void main(String[] args) throws InterruptedException{
		
		//Initislising driver
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//provode implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.id("inputUsername"));
		WebElement password = driver.findElement(By.name("inputPassword"));
		WebElement signIn = driver.findElement(By.className("signInBtn"));
		username.sendKeys("amrutha");
		password.sendKeys("password");
		signIn.click(); 
//		Thread.sleep(3000);
		// Using Cssselector 
		// 1. tagname.classname
		// 2. tagname#id
		//3. tagname[attribute='value'] (use this if there is no ID or className available)
		//4.using indexing :   input[type='text']:nth-child(3)
		WebElement element = driver.findElement(By.cssSelector("p.error"));
		Assert.assertEquals(element.getText(), "* Incorrect username or password");	
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Amrutha");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("amruthavenkateshhhp@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8765432345");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String actualMessage = driver.findElement(By.xpath("//form//p[@class='infoMsg']")).getText();
		Assert.assertEquals(actualMessage, "Please use temporary password 'rahulshettyacademy' to Login.");
		
		// Login to wensite 
		
		String[] tempPasswords = actualMessage.split("'");
			System.out.println(tempPasswords[1]);
			driver.findElement(By.xpath("//button[.='Go to Login']")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Amrutha");
			driver.findElement(By.name("inputPassword")).sendKeys(tempPasswords[1]);
			driver.findElement(By.cssSelector("#chkboxTwo")).click();
			driver.findElement(By.cssSelector("button[type='submit']")).click();					
		System.out.println("SUCCESS");
//		driver.quit();
	}
		
	}
