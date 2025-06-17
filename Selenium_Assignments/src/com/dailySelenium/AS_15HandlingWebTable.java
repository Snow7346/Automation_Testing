package com.dailySelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AS_15HandlingWebTable extends BaseFunction{

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://www.rediff.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Money")).click();
		driver.findElement(By.linkText("Gainers")).click();
        List<WebElement> Rowheaders = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
        for(WebElement H:Rowheaders) {
        	System.out.println(H.getText());
        }
        List<WebElement> Totalrows =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        System.out.println(Totalrows.size());
    
        System.out.println(Totalrows.get(10).getText());
       List<WebElement> AllCompanyName =  driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
        for(int i =0;i<AllCompanyName.size();i++) {
        	System.out.println("Company Name :"+driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+(i+1)+"]/td[1]/a")).getText());
        }
        List<WebElement> PriceColumn = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
        List<Double> Price = new ArrayList<>();
        System.out.println(PriceColumn.size());
        for(int i=0;i<PriceColumn.size();i++) {
         String value =  driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+(i+1)+"]/td[4]")).getText().replace(",","").trim();
         Price.add(Double.parseDouble(value));
        }
         
        Collections.sort(Price);
        
        System.out.println("Highest Price -"+Price.get(Price.size()-1));
        
        
        driver.close();
        
        
        
	}

}
