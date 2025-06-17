package com.WebDriverDemos;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SA_06LocateByClassName {

	public static void main(String[] args) throws InterruptedException {
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.google.co.in/");
	       driver.manage().window().maximize();
	       driver.findElement(By.className("gLFyf")).sendKeys("Vijay");
	       driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
	       
	       
	       Thread.sleep(5000);
	      

	}

}
