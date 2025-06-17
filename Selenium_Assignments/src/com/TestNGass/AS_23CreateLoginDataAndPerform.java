package com.TestNGass;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AS_23CreateLoginDataAndPerform {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index;
  @Test(dataProvider="setLoginData")
  public void  writeloginData(String username,String password){
	  row = sheet.createRow(index);
	  cell = row.createCell(0);
	  cell.setCellValue(username);
	  
	  cell = row.createCell(1);
	  cell.setCellValue(password);
	
	  index++;
	  
  }
  
  @DataProvider
  public Object[][] setLoginData() {
	  return new Object[][] { 
		    new Object[] { "UserName", "Password"},
			new Object[] { "Deepak", "Paratkar"},
			new Object[] { "Pratik", "Patni"},
			new Object[] { "Soumya", "tiwari"}, 
			new Object[] { "Rohit", "Yadav"},
			new Object[] { "John", "Mathew"},
	};
  }
  
  @BeforeTest
  public void beforeTest() {
	  try {
	  file = new File("LoginDataforAssgn.xlsx");
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();
	  sheet = wb.createSheet("Data");
			  
	  }
	  catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
	  
	  
  }

  @AfterTest
  public void afterTest() {
	 try {
	  wb.write(fos);
	  wb.close();
	  fos.close();
  }catch(Exception e) {
	  System.out.println(e.getMessage());
  
  }
  
 }
}
