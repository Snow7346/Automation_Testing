package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SA_19HandlingMultipleDropDown extends BaseFunction {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		launchURL("https://omayo.blogspot.com/");
		WebElement lstbox = driver.findElement(By.id("multiselect1"));
		Select carslist =new Select(lstbox);
		List<WebElement> Cars = carslist.getOptions();
		
        System.out.println(Cars.size());
        
        carslist.selectByIndex(0);
        
        carslist.selectByValue("audix");
        Thread.sleep(2000);
        carslist.deselectAll();
        Thread.sleep(2000);
        System.out.println(carslist.getOptions().get(2).getText());
        driver.close();
        }
}
