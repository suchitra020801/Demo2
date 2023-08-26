package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAttribute {
	
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Test
	
	public void testLinkText() throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		WebElement user_name=driver.findElement(By.name("password"));
		
		String str1=user_name.getAttribute("placeholder");
		System.out.println(str1);
		
		String str2=user_name.getAttribute("class");
		System.out.println(str2);
		
		Thread.sleep(3000);
	}

}
