package com.TestNGass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginInternet {
  File file;
  FileInputStream fis;
  XSSFWorkbook wb;
  XSSFSheet sheet;
  XSSFRow row;
  XSSFCell cell;
  WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  try {
	  file = new File("/Users/arunprasad/Arun's Selenium WebDriver/Selenium_Assignments/LoginDataforAssgn.xlsx");
	  fis = new FileInputStream(file);
	  wb = new XSSFWorkbook(fis);
	  sheet = wb.getSheet("Data");
	  
	  }
	  catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
	 
  }
  @BeforeMethod
  public void launchURL() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/login");
  }
  @Test(dataProvider="testLoginData")
  public void testLogin(String username,String password) throws InterruptedException {
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
	  Thread.sleep(3000);
	  WebElement invalidText = driver.findElement(By.id("flash"));
	  invalidText.getText();
	  if(invalidText.getText().contains("Your username is invalid!")) {
		  String result = "FAILED";
		  System.out.println(result);
	  }
	    
  }
  @DataProvider
  public Object[][] testLoginData() {
	  int totalrows = sheet.getPhysicalNumberOfRows();
	  int totalcolumns =sheet.getRow(0).getPhysicalNumberOfCells();
	 Object[][] data = new Object[totalrows-1][totalcolumns];
	 for(int i=1;i<totalrows;i++) {
		 row = sheet.getRow(i);
		 for(int j=0;j<totalcolumns;j++) {
			 cell = row.getCell(j);
			 data[i-1][j] = cell.toString();
		 }
	 }
	 return data;
  }
  @AfterMethod
  public void closedriver() {
	  driver.close();
  }
  
  @AfterTest
  public void afterTest() throws IOException {
	wb.close();
	fis.close();
  }

}
