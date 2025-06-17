package com.dailySelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AS_07GoogleByCSS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement Googlesearch =driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[1]/div[2]/textarea"));
		Googlesearch.sendKeys("Sachin");
		Googlesearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		
		}

}
