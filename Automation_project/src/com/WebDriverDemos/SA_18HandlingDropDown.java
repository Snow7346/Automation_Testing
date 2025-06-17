package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SA_18HandlingDropDown extends BaseFunction {

	public static void main(String[] args) throws InterruptedException {
	     launchBrowser("Chrome");
	     launchURL("https://register.rediff.com/register/register.php?FormName=user_details");
	     WebElement countryDropdown = driver.findElement(By.id("country"));
         Select countryDD = new Select(countryDropdown);
         System.out.println(countryDD.getFirstSelectedOption().getText());
         System.out.println(countryDD.getOptions().get(10).getText());
         List<WebElement> allcountryoptions = countryDD.getOptions();
         System.out.println(allcountryoptions.size());
         for(WebElement DDoptions:allcountryoptions) {
        	 System.out.println("Options"+DDoptions.getText());
        	 countryDD.selectByVisibleText("Australia");
        	 Thread.sleep(3000);
        	 countryDD.selectByValue("235");
        	 Thread.sleep(3000);
        	 countryDD.selectByIndex(12);
        	 Thread.sleep(2000);
        	 driver.close();
         }
	}

}
