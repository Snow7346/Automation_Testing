package com.dailySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AS_22RandomFormFilling extends BaseFunction{

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.partialLinkText("Auto")).click();
		WebElement BrandDD = driver.findElement(By.id("make"));
		Select brand = new Select(BrandDD);
        brand.selectByVisibleText("Suzuki");
        driver.findElement(By.id("engineperformance")).sendKeys("445");
        driver.findElement(By.id("dateofmanufacture")).sendKeys("22/07/2001");
        WebElement seatsDD = driver.findElement(By.id("numberofseats"));
        Select TotalSeats = new Select(seatsDD);
        TotalSeats.selectByValue("5");
        
        WebElement fuel = driver.findElement(By.id("fuel"));
        Select fuelType = new Select(fuel);
        fuelType.selectByVisibleText("Petrol");
        
        driver.findElement(By.id("listprice")).sendKeys("99000");
        driver.findElement(By.id("annualmileage")).sendKeys("9999");
        
        driver.findElement(By.id("nextenterinsurantdata")).click();
        
        driver.findElement(By.id("firstname")).sendKeys("Arun");
        driver.findElement(By.id("lastname")).sendKeys("Prasad");
        driver.findElement(By.id("birthdate")).sendKeys("22/07/2001");
        
        driver.findElement(By.className("ideal-radio")).click();
        WebElement countryDD = driver.findElement(By.id("country"));
        Select country = new Select(countryDD);
        country.selectByVisibleText("India");
        
        driver.findElement(By.id("zipcode")).sendKeys("641042");
        
        WebElement occupation = driver.findElement(By.id("occupation"));
        Select selectOcc = new Select(occupation);
        selectOcc.selectByVisibleText("Selfemployed");
        
        driver.findElement(By.className("ideal-check")).click();
        driver.findElement(By.id("open")).sendKeys("/Users/arunprasad/Downloads/concrete-wall-texture.jpg");
        driver.findElement(By.id("nextenterproductdata")).click();
        sleep();
        System.out.println("Execution done");
        driver.close();
        
        
        
        
	}

}
