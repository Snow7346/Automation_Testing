package com.ActionEvents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.WebDriverDemos.BaseFunction;

public class SA_32HandlingDoubleClick extends BaseFunction  {

	public static void main(String[] args) {
		   launchBrowser("Chrome");
		   launchURL("https://demo.guru99.com/test/simple_context_menu.html");
		   
		  WebElement Dclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
          Actions act = new Actions(driver);
          Alert alt;
          act.doubleClick(Dclick).build().perform();
          alt = driver.switchTo().alert();
          System.out.println(alt.getText());
          alt.accept();
          driver.close();
	}

}
