package com.WebDriverDemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SA_08LocatebyCSSMultipleAttributes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='txtCustomerID'][type='text']")).sendKeys("ejjaghas");
		driver.findElement(By.cssSelector("input[name='txtPassword'][type='password']")).sendKeys("3748782");
		driver.findElement(By.cssSelector("input[name=Butsub][type='submit']")).click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
