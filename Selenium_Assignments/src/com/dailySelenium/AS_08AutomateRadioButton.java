package com.dailySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AS_08AutomateRadioButton extends BaseFunction {

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://www.chabadpotomac.com/templates/articlecco_cdo/aid/6617538/jewish/Hebrew-School-New-Student.htm");
		
		WebElement r1 =driver.findElement(By.id("input_25_0"));
		System.out.println("Checking default radio button options");
		System.out.println(r1.isDisplayed());
		System.out.println(r1.isSelected());
		System.out.println(r1.isEnabled());
		r1.click();
		System.out.println(r1.isSelected());
		WebElement r2 = driver.findElement(By.id("input_25_1"));
		System.out.println("Checking default radio button options");
		System.out.println(r2.isDisplayed());
		System.out.println(r2.isSelected());
		System.out.println(r2.isEnabled());
		r2.click();
		System.out.println(r2.isSelected());
		WebElement r3 = driver.findElement(By.id("input_25_2"));
		System.out.println("Checking default radio button options");
		System.out.println(r3.isDisplayed());
		System.out.println(r3.isSelected());
		System.out.println(r3.isEnabled());
		r3.click();
		System.out.println(r3.isSelected());
		
		driver.close();
		

	}

}
