package com.dailySelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseFunction {
	public static WebDriver driver = null;

	public static void launchBrowser(String browserName) {

		if (browserName.equals("Chrome")) {

			driver = new ChromeDriver();

		} else if (browserName.equals("Firefox")) {

			driver = new FirefoxDriver();

		} else if (browserName.equals("Safari")) {

			driver = new SafariDriver();
		}

		driver.manage().window().maximize();
	}
	public static void launchURL(String url) 
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
		driver.get(url); 
	}
	public static void sleep() {
		try {
		Thread.sleep(5000);
		}catch(Exception e) {
			e.getMessage();
		}
	}
}
