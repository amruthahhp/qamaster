package com.qamaster;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Locators2 {
public static void main(String[] args) throws InterruptedException{
		
		//Initislising driver
		
		WebDriver driver = new ChromeDriver();	
//		WebDriver driver = new FirefoxDriver();	
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//provode implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String name = "Amrutha";
		WebElement username = driver.findElement(By.id("inputUsername"));
		WebElement password = driver.findElement(By.name("inputPassword"));
		WebElement signIn = driver.findElement(By.className("signInBtn"));
		username.sendKeys(name);
		password.sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		String message = driver.findElement(By.xpath("//p")).getText();
		Assert.assertEquals("You are successfully logged in.", message);
		Thread.sleep(2000);
		String actualName = driver.findElement(By.xpath("//h2")).getText();
		Assert.assertEquals("Hello "+name+",", actualName);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
}

}
