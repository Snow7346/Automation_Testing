package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SA_17HandleCheckboxes extends BaseFunction{

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		launchURL("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement chkbox = driver.findElement(By.className("nomargin"));
		System.out.println("Before checking the chkbox");
		System.out.println(chkbox.isDisplayed());
		System.out.println(chkbox.isSelected());
		System.out.println(chkbox.isEnabled());
		Thread.sleep(2000);
		if(chkbox.isSelected()) {
			chkbox.click();			
		}
		else
		{
			chkbox.click();
		}
		System.out.println("After clicking the chkbox ");
		System.out.println(chkbox.isDisplayed());
		System.out.println(chkbox.isSelected());
		System.out.println(chkbox.isEnabled());
		driver.close();
	}

}
