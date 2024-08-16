package com.qamaster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//Static dropdown practice
		Thread.sleep(2000L);
		Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		select.selectByIndex(2);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("USD");
		System.out.println(select.getFirstSelectedOption().getText());	
		select.selectByValue("INR");
		System.out.println(select.getFirstSelectedOption().getText());
		
		//handling incremental dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		for(int i=1;i<6;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//handling dynamic dropdown
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click(); 
		//use indexing to click on dropdowns because of 2 elements might be present with same locator 
		//if index not allowed then use paremt xpath [one whitespace and then [child xpath]
	//ex : 	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
	}

}
