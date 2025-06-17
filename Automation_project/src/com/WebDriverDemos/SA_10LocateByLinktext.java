package com.WebDriverDemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SA_10LocateByLinktext {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		 WebElement Title = driver.findElement(By.linkText("Images"));
		  Title.click();
		 System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Advertising")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

	}

}
