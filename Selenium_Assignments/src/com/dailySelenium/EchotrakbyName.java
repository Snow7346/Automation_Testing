package com.dailySelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EchotrakbyName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f ");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtCustomerID")).sendKeys("arun890");
		driver.findElement(By.name("txtPassword")).sendKeys("234567");
		driver.findElement(By.name("Butsub")).click();
		WebElement error = driver.findElement(By.id("lblMsg"));
		String Errmsg = error.getText();
		
		System.out.println(Errmsg);
		Thread.sleep(5000);
		driver.close();
	}

}
