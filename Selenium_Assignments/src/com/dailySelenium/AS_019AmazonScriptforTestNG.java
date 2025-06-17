package com.dailySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AS_019AmazonScriptforTestNG {
	WebDriver driver;
	
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  @BeforeMethod
  public void LaunchAmazon() {
	  driver.get("https://www.amazon.in/");
	  System.out.println(driver.getTitle());
  }
  @Test(priority=1)
  public void SellLink() {
	  driver.findElement(By.linkText("Sell")).click();
	  System.out.println(driver.getTitle());
  }
  @Test(priority=2)
  public void BestSellLink() {
	  driver.findElement(By.partialLinkText("Best")).click();
	  System.out.println(driver.getTitle());
  }
  @Test(priority=3)
  public void MobilesLink() {
	  driver.findElement(By.partialLinkText("Mobiles")).click();
	  System.out.println(driver.getTitle());
  }
  @Test(priority=4)
  public void Electronics() {
	  driver.findElement(By.linkText("Electronics")).click();
	  System.out.println(driver.getTitle());
  }
  @AfterMethod
  public void executionDone() {
	  System.out.println("AfterMethod");
  }
  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
	  
  }

}
