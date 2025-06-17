package com.dataDrivenUsingExcel;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class CreateLoginData {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index = 0;
	
  @Test(dataProvider = "setLoginData")
  public void getLoginData(String username, String password,String flag) {
	  row = sheet.createRow(index);
	  cell = row.createCell(0);
	  cell.setCellValue(username);
	  
	  cell = row.createCell(1);
	  cell.setCellValue(password);
	  
	  cell = row.createCell(2);
	  cell.setCellValue(flag);
	  
	  index++;  
  }

  @DataProvider
  public Object[][] setLoginData() {
	  return new Object[][] { 
		    new Object[] { "UserName", "Password", "Flag" },
			new Object[] { "Deepak", "Paratkar", "true" },
			new Object[] { "Pratik", "Patni", "false" },
			new Object[] { "Soumya", "tiwari", "true" }, 
			new Object[] { "Rohit", "Yadav", "False" },
			new Object[] { "John", "Mathew", "true" },
	};
  }
  @BeforeTest
  public void beforeTest() {
	  try {
	  file = new File("LoginData.xlsx");
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();
	  sheet = wb.createSheet("LoginData");
	  
	  }
	  catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
	  wb.close();
	  fos.close();
  }

}
