package com.WebDriverDemos;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class SA_15LocateByTagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.co.in");
		
		//List<WebElement> allLinks = 
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		System.out.println(allLinks.get(0).getText());
	
		for(int i=0;i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
		}
		driver.close();
		}
}
