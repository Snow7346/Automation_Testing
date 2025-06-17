package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_14LocateByRelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hdvajhsvjas");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("3746973439");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
