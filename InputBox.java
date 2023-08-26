package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InputBox {
	
	String url="https://www.facebook.com/login/";
	
	@Test
	public void printInputBox() {
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com");

		
		List<WebElement> inputElements = driver.findElements(By.tagName("input"));
		int number_Of_Input_Boxes=driver.findElements(By.tagName("input")).size();
		System.out.println("Input Box count :" + number_Of_Input_Boxes);
        
        for (WebElement webelement : inputElements) {
            System.out.println("Input Element: " + webelement.getAttribute("name"));
            
            
            driver.quit();
        }
		
		
	}
	
	

}
