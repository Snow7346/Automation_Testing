package com.ActionEvents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.WebDriverDemos.BaseFunction;

public class SA_29HandlingMouseHover extends BaseFunction{

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		launchURL("https://www.istqb.in/");
		Actions act = new Actions(driver);
		
	    WebElement homelink = driver.findElement(By.linkText("HOME"));
	    act.moveToElement(homelink).build().perform();
	    
		List<WebElement> allrounder = driver.findElements(By.xpath("//nav[@role='navigation']/ul/li"));
		for(int i=0;i<allrounder.size();i++) {
			act.moveToElement(allrounder.get(i)).build().perform();
			System.out.println(allrounder.get(i).getText());
			Thread.sleep(2000);
		}

	}

}
