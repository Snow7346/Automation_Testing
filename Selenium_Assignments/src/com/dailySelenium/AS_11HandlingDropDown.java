package com.dailySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AS_11HandlingDropDown extends BaseFunction {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		launchURL("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement Date = driver.findElement(By.cssSelector("select[class='day']"));
		WebElement month = driver.findElement(By.cssSelector("select[class='middle month']"));
		WebElement year = driver.findElement(By.cssSelector("select[class='year']"));
		Select DateDD = new Select(Date);
		Select monthDD = new Select(month);
		Select yearDD = new Select(year);
		System.out.println(DateDD.getFirstSelectedOption().getText());
		System.out.println(monthDD.getFirstSelectedOption().getText());
		System.out.println(yearDD.getFirstSelectedOption().getText());
		DateDD.selectByValue("22");
		monthDD.selectByVisibleText("JUL");
		yearDD.selectByValue("2001");
		Thread.sleep(2000);
		System.out.println(DateDD.getFirstSelectedOption().getText()+" "+" "+monthDD.getFirstSelectedOption().getText()+" "+yearDD.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		driver.close();
		

	}

}
