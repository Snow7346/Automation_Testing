package com.dailySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AS_20SelectDOBusingTestNG {
      WebDriver driver;
      @BeforeTest
	public void launchURL() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}
      @Test
    public void selectingDOB() throws InterruptedException {
    	driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
    	WebElement monthDD = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
    	Select MDD = new Select(monthDD);
    	MDD.selectByVisibleText("July");
    	Thread.sleep(2000);
    	WebElement yearDD = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
        Select YDD = new Select(yearDD);
        YDD.selectByValue("2001");
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'react-datepicker__day--022')]"))).click();
 
       
       
    		   Thread.sleep(2000);
        System.out.print("My birth Date is" + "22" +"|"+ monthDD.getText() + "|"+ yearDD.getText() );
        
    }
      @AfterTest
    public void AfterTest() {
    	System.out.println("Execution done");
    	driver.close();
    }
	
	
	
	
}
