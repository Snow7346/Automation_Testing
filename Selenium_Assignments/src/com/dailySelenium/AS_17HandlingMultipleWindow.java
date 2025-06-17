package com.dailySelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AS_17HandlingMultipleWindow extends BaseFunction {

	public static void main(String[] args) {
		launchBrowser("Chrome");

		try {
            // Open the DemoQA Browser Windows page
            driver.get("https://demoqa.com/browser-windows");

            // Wait for the page to load
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
           	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tabButton")));

            // 1. New Tab
            WebElement newTabButton = driver.findElement(By.id("tabButton"));
            newTabButton.click();

            // Switch to the new tab
            Set<String> windowHandles = driver.getWindowHandles();
            String originalWindow = driver.getWindowHandle();
            for (String handle : windowHandles) {
                if (!handle.equals(originalWindow)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            // Retrieve and print the message
            WebElement newTabMessage = driver.findElement(By.id("sampleHeading"));
            System.out.println("Message from new tab: " + newTabMessage.getText());

            // Close the new tab and switch back to the original window
            driver.close();
            driver.switchTo().window(originalWindow);

            // 2. New Window
            WebElement newWindowButton = driver.findElement(By.id("windowButton"));
            newWindowButton.click();

            // Switch to the new window
            windowHandles = driver.getWindowHandles();
            for (String handle : windowHandles) {
                if (!handle.equals(originalWindow)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            // Retrieve and print the message
            WebElement newWindowMessage = driver.findElement(By.id("sampleHeading"));
            System.out.println("Message from new window: " + newWindowMessage.getText());

            // Close the new window and switch back to the original window
            driver.close();
            driver.switchTo().window(originalWindow);
            sleep();
            // 3. New Window Message
            WebElement newWindowMessageButton = driver.findElement(By.id("messageWindowButton"));
            newWindowMessageButton.click();

            // Switch to the new window
            windowHandles = driver.getWindowHandles();
            for (String handle : windowHandles) {
                if (!handle.equals(originalWindow)) {
                    driver.switchTo().window(handle);
                    driver.manage().window().maximize();
                    break;
                }
            }

            // Retrieve and print the message
            WebElement newWindowMessageContent = driver.findElement(By.xpath("/html/body/text()"));
            System.out.println("Message from new window with message: " + newWindowMessageContent.getText());

            // Close the new window and switch back to the original window
            driver.close();
            driver.switchTo().window(originalWindow);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the original window
            driver.quit();
	}

}
}