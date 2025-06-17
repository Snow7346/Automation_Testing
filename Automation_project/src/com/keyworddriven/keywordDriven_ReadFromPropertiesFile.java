package com.keyworddriven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class keywordDriven_ReadFromPropertiesFile {
	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties prop;
  @Test
  public void loginFacebook(){
	  System.out.println("Application URL "+ prop.getProperty("appURL"));
		
		String[] appURL= prop.getProperty("appURL").split(",");
		System.out.println("1 URl" + appURL[0]);
		System.out.println("2 URl" + appURL[1]);
		String faceBookURL = appURL[0];
		//String GoogleURL = appURL[1];
		
	  
	  
	  
	  driver.get(faceBookURL);
	  driver.findElement(By.id(prop.getProperty("Login_Username_Id"))).sendKeys(prop.getProperty("Login_Username"));
	  driver.findElement(By.id(prop.getProperty("Login_Password_Id"))).sendKeys(prop.getProperty("Login_Password"));
	  driver.findElement(By.name(prop.getProperty("Login_Button_Name"))).click();
  }
  @BeforeTest
  public void beforeTest() {
	  try {
	  file = new File("/Users/arunprasad/Arun's Selenium WebDriver/Automation_project/src/com/keyworddriven/keyWord.properties");
	  fis = new FileInputStream(file);
	  prop = new Properties();
	  prop.load(fis);
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }catch(Exception e) {
	 System.out.println(e.getMessage());
   }
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
