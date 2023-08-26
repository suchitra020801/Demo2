package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Base {
	
	 WebDriver driver;
	 
	 String url="http://www.Chrome.com";
	
	public  void selectBrowser(String browsername) {
		
		if (browsername.equals("Chrome")) {
			
			driver=new ChromeDriver();
			
		}else if(browsername.equals("edge")) {
			
			 driver=new EdgeDriver();
			
		}else {
		driver=new ChromeDriver();	
			
		}
		
	}
	
	@Test
	public void testBrowser() throws InterruptedException {
		selectBrowser("Chrome");
		driver.get(url);
		 
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Page Title :"+url);
		
		
		
	}
	
		

}
