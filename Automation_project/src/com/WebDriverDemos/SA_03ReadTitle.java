package com.WebDriverDemos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_03ReadTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		String PageTitle = driver.getTitle();		
		String PageUrl = driver.getCurrentUrl();
		System.out.println("PageTitle is -"+PageTitle);
		System.out.println("Current pageUrl is -"+PageUrl);
		if(PageTitle.equals("Google")) {
			System.out.println("Test case success");
		}
		else {
			System.out.println("Test case fails");
		}
		
		Thread.sleep(3000);
		driver.close();		

	}

}
