package com.alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.WebDriverDemos.BaseFunction;

public class SA_24HandlingAlert extends BaseFunction {

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://demoqa.com/alerts");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		Alert alt;
		driver.findElement(By.id("alertButton")).click();
		alt = driver.switchTo().alert();
		alt.accept();
		driver.switchTo().defaultContent();
		sleep();
		driver.findElement(By.id("timerAlertButton")).click();
		wait.until(ExpectedConditions.alertIsPresent());
	    alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		driver.switchTo().defaultContent();
		sleep();
		driver.findElement(By.id("confirmButton")).click();
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		driver.switchTo().defaultContent();
	    String result =	driver.findElement(By.id("confirmResult")).getText();
	    System.out.println(result);
		driver.close();
		
	}

}
