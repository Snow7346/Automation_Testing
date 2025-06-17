package com.TestNGass;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dailySelenium.BaseFunction;

public class AS_022LoginHRM extends BaseFunction{
	
  @BeforeTest
  public void beforeTest() {
	  launchBrowser("Chrome");
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  launchURL("https://practicetestautomation.com/practice-test-login/");
	  
  }
  
  @Test
  public void loginHRM(){
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
  }
  @AfterMethod
  public void afterMethod() {
	  sleep();
	  driver.close();
  }
 

  @AfterTest
  public void afterTest() {
	  System.out.println("Execution done!");
  }

}
