package com.WebDriverDemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SA_05LocateByID {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("arujnp");
		driver.findElement(By.id("pass")).sendKeys("3846245");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
