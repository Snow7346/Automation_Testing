package com.dailySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AS_13MakeMyTripExplicitWait extends BaseFunction {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		launchURL("https://www.makemytrip.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#SW > div.landingContainer.eng > div.headerOuter > div.imageSliderModal.modal.displayBlock.modalLogin.dynHeight.personal > div > section > span"))).click();
		 WebElement busTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Buses']")));
         busTab.click();
         
         
         WebElement fromInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("fromCity")));
         fromInput.click();
         WebElement fromTextInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='From']")));
         fromTextInput.sendKeys("Coim");
         Thread.sleep(2000);
         WebElement firstFromSuggestion = wait.until(ExpectedConditions
        		    .elementToBeClickable(By.cssSelector("ul.react-autosuggest__suggestions-list li:nth-child(1)")));
         firstFromSuggestion.click();
         sleep();
         WebElement toInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("toCity")));
         toInput.click();
        Thread.sleep(2000);
         WebElement toTextInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='To']")));
         toTextInput.sendKeys("Chen");
         Thread.sleep(2000);
         WebElement firstToSuggestion = wait.until(ExpectedConditions
        		    .elementToBeClickable(By.cssSelector("ul.react-autosuggest__suggestions-list li:nth-child(1)")));
         firstToSuggestion.click();

         WebElement dateInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='travelDate']")));
         dateInput.click();
         Thread.sleep(2000);
         WebElement activeDate = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.DayPicker-Day--selected, div.DayPicker-Day--today + div:not(.DayPicker-Day--disabled)")));
         activeDate.click();
         Thread.sleep(1000);
         WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Search']")));
         searchButton.click();
         driver.close();
	}

}
