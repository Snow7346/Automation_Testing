package com.WebDriverDemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SA_13LocateByCompleteXpath {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[1]/input")).sendKeys("wcjhcwead");
		driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[2]/input")).sendKeys("37246823");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[3]/button")).click();
		
		Thread.sleep(3000);
		driver.close();
	
}
}

