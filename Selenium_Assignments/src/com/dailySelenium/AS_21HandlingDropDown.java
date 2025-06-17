package com.dailySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AS_21HandlingDropDown extends BaseFunction {

	public static void main(String[] args) {
	      launchBrowser("Chrome");
	      launchURL("https://register.rediff.com/register/register.php?FormName=user_details ");
	      WebElement dayDD = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
          Select day = new Select(dayDD);
          day.selectByValue("22");
          WebElement monthDD = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
          Select month = new Select(monthDD);
          month.selectByVisibleText("JUL");
          WebElement yearDD = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
          Select year = new Select(yearDD);
          year.selectByValue("2001");
    
          System.out.print("My DOB - "+ day.getFirstSelectedOption().getText()+"|"+month.getFirstSelectedOption().getText()+"|"+year.getFirstSelectedOption().getText());
	      driver.close();
	}

}
