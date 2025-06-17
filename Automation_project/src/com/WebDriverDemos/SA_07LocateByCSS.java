package com.WebDriverDemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SA_07LocateByCSS {

	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.cssSelector("input[id='email']")).sendKeys("shdgasgduasy");
	     driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("641834874");
	     driver.findElement(By.cssSelector("button[name='login']")).click();
	     Thread.sleep(3000);
	     
	     driver.close();

	}

}
