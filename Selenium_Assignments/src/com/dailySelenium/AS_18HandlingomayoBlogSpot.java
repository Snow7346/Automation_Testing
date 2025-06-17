package com.dailySelenium;

import java.io.File;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class AS_18HandlingomayoBlogSpot extends BaseFunction {

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("Tutorial")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String mainwindow = it.next();
		String childwindow = it.next();
	
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		
		
		Date d = new Date();
		String filename = d.toString().replace(":","_").replace(" ","_");
		System.out.println(filename);
        
		File SSfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileHandler.copy(SSfile, new File(filename+".jpeg"));
		File file = new File(filename);
		file.exists();
		}catch(Exception e) {
			e.getMessage();
		}
		
		driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/table/tbody/tr/td[2]")).click();
		sleep();
		
		windows = driver.getWindowHandles();
		it = windows.iterator();
		
        while (it.hasNext()) {
            String thirdWindowHandle = it.next();
            if (!thirdWindowHandle.equals(mainwindow) && !thirdWindowHandle.equals(childwindow)) {
                driver.switchTo().window(thirdWindowHandle);
                System.out.println(driver.getTitle());
                break;
            }
        }
        driver.switchTo().window(mainwindow);
       
		driver.quit();
		

	}

}
