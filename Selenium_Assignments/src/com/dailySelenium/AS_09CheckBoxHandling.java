package com.dailySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AS_09CheckBoxHandling extends BaseFunction {

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://omayo.blogspot.com/");
		WebElement ch1 = driver.findElement(By.cssSelector("input[value='Pen']"));
		WebElement ch2 = driver.findElement(By.cssSelector("input[value='Book']"));
		WebElement ch3 = driver.findElement(By.cssSelector("input[value='Laptop']"));
		WebElement ch4 = driver.findElement(By.cssSelector("input[value='Bag']"));
		System.out.println(ch1.isSelected());
		System.out.println(ch2.isSelected());
      	System.out.println(ch3.isSelected());
      	System.out.println(ch4.isSelected());
        if(ch2.isSelected())
        ch3.click();
        else
        ch4.click();
        System.out.println(ch3.isSelected());
        
        driver.close();
    
	}

}
