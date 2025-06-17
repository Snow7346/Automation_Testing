package com.dailySelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AS_14HandlingWebTable extends BaseFunction {
	public static void main(String args[]) {
           launchBrowser("Chrome");
           launchURL(" https://www.cricbuzz.com/live-cricket-scorecard/115345/kkr-vs-csk-57th-match-indian-premier-league-2025");
           List<WebElement> listofbatter = driver.findElements(By.xpath("//*[@id=\"innings_2\"]/div[1]/div"));
           System.out.println(listofbatter.size());
           
           for(int i=0;i<listofbatter.size();i++) 
           {
        	   System.out.println(
         driver.findElement(By.xpath("//*[@id=\"innings_2\"]/div/div["+(i+3)+"]/div/a")).getText());
           }
	}
}
