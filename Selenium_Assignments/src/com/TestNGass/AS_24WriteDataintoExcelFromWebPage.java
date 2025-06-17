package com.TestNGass;

import java.io.File;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS_24WriteDataintoExcelFromWebPage {

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://automationexercise.com/products");
		  Workbook wb = new XSSFWorkbook();
          Sheet sheet = wb.createSheet("Products");
          
          Row header = sheet.createRow(0);
          header.createCell(0).setCellValue("Product name");
          header.createCell(1).setCellValue("Price");
          header.createCell(2).setCellValue("Availability");
          
        List<WebElement> products = driver.findElements(By.xpath("/html/body/section[2]/div/div/div[2]/div/div"));
        System.out.println(products.size());
        int rownum=1;
        for(int i=0;i<products.size()-1;i++) 
        {
        String name = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div["+(i+2)+"]/div/div[1]/div[1]/p")).getText();
        String price = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div["+(i+2)+"]/div/div[1]/div[1]/h2")).getText();
        String availability;
        WebElement addtocart = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a"));
        availability = addtocart.isDisplayed()&&addtocart.isEnabled()? "In Stock":"Out of stock";
        
        Row row = sheet.createRow(rownum);
        row.createCell(0).setCellValue(name);
        row.createCell(1).setCellValue(price);
        row.createCell(2).setCellValue(availability);
        rownum++;
        }
        for(int i=0;i<3;i++) {
        	sheet.autoSizeColumn(i);
        }
        
        
        try {
        File file = new File("products.xlsx");
        FileOutputStream fos = new FileOutputStream(file);
        wb.write(fos);
        wb.close();
        fos.close();
        }catch(Exception e) {
        	e.getMessage();
        }
        driver.close();
        
	}

}


