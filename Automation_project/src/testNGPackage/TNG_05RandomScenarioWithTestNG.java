package testNGPackage;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.WebDriverDemos.BaseFunction;

public class TNG_05RandomScenarioWithTestNG extends BaseFunction {
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
		launchBrowser("Chrome");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		launchURL("https://www.facebook.com/");
	}
   @AfterMethod
	public void afterMethod() {
    	System.out.println("AfterMethod");
		sleep();
	}
	@Test(priority = 1)
	@Parameters({"Username","Password"})
	public void loginHRM(String Username,String Password){
		driver.findElement(By.name("email")).sendKeys(Username);
		driver.findElement(By.name("pass")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
	}
	@Test(priority = 2)
	@Parameters({"Username","Password"})
	public void loginHRM1(String Username,String Password) {
		driver.findElement(By.name("email")).sendKeys(Username);
		driver.findElement(By.name("pass")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
	}

	@Test(priority = 3)
	@Parameters({"Username","Password"})
	public void loginHRM2(String Username,String Password) {
		driver.findElement(By.name("email")).sendKeys(Username);
		driver.findElement(By.name("pass")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
	}
	@AfterTest
	public void exitDriver() {
		System.out.println("AfterTest");
		driver.close();
	}
}