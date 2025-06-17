package com.Fileupload;

import org.openqa.selenium.By;

import com.WebDriverDemos.BaseFunction;

public class SA_26HandlingFileUpload extends BaseFunction {

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://demoqa.com/automation-practice-form");
		//driver.navigate().to(null) // launch the URL;
		//driver.navigate().refresh(); // refresh
		//driver.navigate().back(); // taking browser to previous url in single session
		//driver.navigate().forward(); // taking browser forward in single session.
		sleep();
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\91790\\Pictures\\Screenshots");
		sleep();
		driver.close();

	}

}
