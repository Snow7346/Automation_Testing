package com.WebDriverDemos;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	    static @FindBy(name="email")WebElement login_username;
	    static@FindBy(name="password")WebElement login_pass;
	    static @FindBy(xpath="//button[@type='submit']")WebElement login_submit;
	
	
	
       static WebDriver driver;
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		PageFactory.initElements(driver,loginPage.class);
        driver.get("https://automationexercise.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        login();
        
        System.out.println("Execution Success");
        
        driver.close();
		
	}
	public static void login() {
		login_username.sendKeys("arun@123");
		login_pass.sendKeys("dbvjqshdv");
		login_submit.click();
	}

}
