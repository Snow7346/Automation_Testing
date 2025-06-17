package testNGPackage;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.WebDriverDemos.BaseFunction;

public class TNG_08PracticalImplementationOfDP extends BaseFunction {
	
	// number of rows would equals to no. of test iterations
		// number of column would equals to no. of test variables
		@BeforeMethod
		public void BeforeMethod() {
			System.out.println("BeforeMethod");
			launchBrowser("Chrome");
			launchURL("https://www.facebook.com/");
		}
		@Test(dataProvider="sendData")
		public void loginHRM(String username,String password) {
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
		}
		@AfterMethod
		public void AfterMethod() {
			System.out.println("AfterMethod");
			sleep();
			driver.quit();
		}
		@DataProvider
		public Object[][] sendData() {
			Object[][] data = new Object[2][2];
			data [0][0] = "Admin";
			data[0][1] = "admin123";
			
			data[1][0] = "nitin";
			data[1][1] = "smart123";
			return data;
		}
	 
}
