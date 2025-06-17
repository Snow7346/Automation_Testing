package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SA_02LaunchingSafariBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver(); 
		
	
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.close();
		}
}
