package com.dailySelenium;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class AS_12redbusMultipleDropDown extends BaseFunction{

	public static void main(String[] args) throws InterruptedException {
	      launchBrowser("Chrome");
	      launchURL("https://www.redbus.in/");
	      driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Coim");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();
	    
	      driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("Bang");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]/div/text")).click();
	     
	      driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div/span")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/span[1]/div[3]/span[1]"))
	      .click();
	      driver.findElement(By.xpath("//button[@id='search_button']")).click();
	      sleep();
	      
	      Date d = new Date();
			String filename = d.toString().replace(":","_").replace(" ","_");
			System.out.println(filename);
	        try {
			File SSfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(SSfile, new File(filename+"jpeg"));
			File file = new File(filename);
			file.exists();
	        }catch(Exception e) {
	        	e.getMessage();
	        }
	      
	      
	  String BusName =    driver.findElement(By.cssSelector("#result-section > div.group-data.clearfix > div > div.clearfix > div > div.w-17.fl > div")).getText();
	      System.out.println(BusName);
	  Thread.sleep(3000);
	      driver.close();

	}

}
