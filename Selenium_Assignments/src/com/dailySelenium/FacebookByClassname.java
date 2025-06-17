package com.dailySelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FacebookByClassname {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("inputtext")).sendKeys("svddassd");
		driver.findElement(By.className("_9npi")).sendKeys("28438949");
		driver.findElement(By.className("_42ft")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
