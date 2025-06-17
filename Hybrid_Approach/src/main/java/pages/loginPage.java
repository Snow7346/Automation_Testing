package pages;

import org.openqa.selenium.By;

import BaseFunction.baseUtil;

public class loginPage extends baseUtil {
	
	final By LOCATOR_LOGIN_USERNAME = By.name("email");
	final By LOCATOR_LOGIN_PASSWORD = By.name("password");
	final By LOCATOR_LOGIN_BUTTON = By.xpath("//button[@type='submit']");
	
	
	public void launchURL(String URL) {
		
		getURL(URL);
	}
	public void login(String username,String password) {
		
		enterData(LOCATOR_LOGIN_USERNAME,username);
		enterData(LOCATOR_LOGIN_PASSWORD,password);
	}
   public void loginClick() {
	   
	   clickLogin(LOCATOR_LOGIN_BUTTON);
	   
   }

}
