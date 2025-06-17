package com.dailySelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EchotrakLocateByXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f ");
		driver.findElement(By.xpath("//input[@id='txtCustomerID']")).sendKeys("dsjfhsdfhsdbf");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("85998459");
		driver.findElement(By.xpath("//input[@id='Butsub']")).click();
		Thread.sleep(2000);
		String Errmsg = driver.findElement(By.xpath("//*[@id='lblMsg']")).getText();
		System.out.println(Errmsg);
		
		Thread.sleep(2000);
		driver.close();
	

	}

}
