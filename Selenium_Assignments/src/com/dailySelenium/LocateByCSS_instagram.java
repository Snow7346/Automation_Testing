package com.dailySelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocateByCSS_instagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/?flo=true");
	    driver.manage().window().maximize();
	    
        driver.findElement(By.cssSelector("input[aria-required='true']")).sendKeys("arunprasad@gmail");	   
       driver.findElement(By.cssSelector("input[type='password']")).sendKeys("984574985");
       driver.findElement(By.cssSelector("button[type='submit']")).click();
	    
	    
	    Thread.sleep(3000);
	    driver.close();

	}

}
