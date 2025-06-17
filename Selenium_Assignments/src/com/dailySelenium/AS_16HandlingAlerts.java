package com.dailySelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AS_16HandlingAlerts extends BaseFunction {

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://omayo.blogspot.com/");
		Alert alt;
		driver.findElement(By.id("alert1")).click();
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
	    alt.accept();
	    driver.findElement(By.id("prompt")).click();
	    alt = driver.switchTo().alert();
	    System.out.println(alt.getText());
	    alt.sendKeys("Arun");
	    alt.accept();
	    
	    
	    
		driver.close();
		
	}
	
	
}
	
