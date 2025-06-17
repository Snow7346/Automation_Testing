package com.ActionEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.WebDriverDemos.BaseFunction;

public class SA_30HandlingDragandDrop extends BaseFunction{

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		launchURL("https://jqueryui.com/droppable/");
		Actions act = new Actions(driver);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
        act.dragAndDrop(drag, drop).build().perform();
        Thread.sleep(3000);
        driver.switchTo().parentFrame();
        driver.quit();
        
	}

}
