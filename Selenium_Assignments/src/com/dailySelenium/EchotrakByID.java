package com.dailySelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EchotrakByID {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f ");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("txtCustomerID")).sendKeys("arun678");
		driver.findElement(By.id("txtPassword")).sendKeys("4364732");
		driver.findElement(By.id("Butsub")).click();
		
		System.out.println("Execution done");
		
		Thread.sleep(3000);
		driver.close();
	}

}
