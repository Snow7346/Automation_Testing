package com.WebDriverDemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SA_04LocateByName {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("email")).sendKeys("arunprasadcbe@");
	driver.findElement(By.name("pass")).sendKeys("12123234");
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(3000);
     driver.close();
	}

}
