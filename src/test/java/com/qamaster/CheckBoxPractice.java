package com.qamaster;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected();
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click();
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected();
		driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).click();
		
		//to get all checkboxes in the page
		Thread.sleep(3000);
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(3000);
		for(WebElement checkbox : checkboxes) {
			if(checkbox.isSelected()) {
				System.out.println(checkbox.getText());
			}
				
		}
		
		
	}

}
