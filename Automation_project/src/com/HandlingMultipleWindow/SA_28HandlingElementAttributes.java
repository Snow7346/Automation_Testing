package com.HandlingMultipleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.WebDriverDemos.BaseFunction;

public class SA_28HandlingElementAttributes extends BaseFunction{

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://demoqa.com/text-box");
		
		WebElement place = driver.findElement(By.id("userName"));
        //System.out.println(place);
        //String old = driver.findElement(By.id("userName")).getAttribute("placeholder");
		//System.out.println("username attribute "+ old);
		System.out.println(place.getDomAttribute("placeholder"));
		place.sendKeys("arun");
		sleep();
		place.clear();
		driver.close();
	}

}
