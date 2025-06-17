package com.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.WebDriverDemos.BaseFunction;

public class SA_25PromptAlert extends BaseFunction {

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://demoqa.com/alerts");
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		Alert alt;
		driver.findElement(By.id("promtButton")).click();
		alt = driver.switchTo().alert();

		alt.sendKeys("Nitin John"); 
		
		alt.accept(); 

		String alertMessage = driver.findElement(By.id("promptResult")).getText();
		System.out.println(" alert message " + alertMessage);
		driver.close();
  
    
	}
}
