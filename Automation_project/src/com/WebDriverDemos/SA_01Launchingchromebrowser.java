package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_01Launchingchromebrowser {

	public static void main(String[] args) throws InterruptedException {
		//create an object of WebDriver.
		
		// interfaceClassName object = new ClassName;
		
		// Shift+Control+O for import from library 
		WebDriver driver = new ChromeDriver();  //checked compilation error
		
		//launch the URL, get function which helps to launch
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.close();
		}

}
