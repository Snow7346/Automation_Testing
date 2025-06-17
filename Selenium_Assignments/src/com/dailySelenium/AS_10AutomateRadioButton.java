package com.dailySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AS_10AutomateRadioButton extends BaseFunction{

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://echoecho.com/htmlforms10.htm");
		WebElement r1 = driver.findElement(By.cssSelector("input[value='Milk']"));
		WebElement r2 = driver.findElement(By.cssSelector("input[value='Butter']"));
		WebElement r3 = driver.findElement(By.cssSelector("input[value='Cheese']"));
		WebElement r4 = driver.findElement(By.cssSelector("input[value='Water']"));
		WebElement r5 = driver.findElement(By.cssSelector("input[value='Beer']"));
		WebElement r6 = driver.findElement(By.cssSelector("input[value='Wine']"));
		System.out.println(r1.isSelected());
		System.out.println(r2.isSelected());
		System.out.println(r3.isSelected());
		System.out.println(r4.isSelected());
		System.out.println(r5.isSelected());
		System.out.println(r6.isSelected());
		r1.click();
		r3.click();
		r4.click();
		r5.click();
		System.out.println(r5.isSelected());
		driver.close();
		

	}

}
