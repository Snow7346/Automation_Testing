package com.WebDriverDemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
public class SA_16LocateByRelativeOperator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("pass"))).sendKeys("sjdvdusadsa");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("email"))).sendKeys("23416941");
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(By.id("pass"))).click();
		Thread.sleep(2000);
		driver.close();

	}

}
