package wait_mechanism;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.WebDriverDemos.*;
public class SA_22HandlingFluentWait extends BaseFunction {

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
       driver.findElement(By.id("src")).sendKeys("Kolh");
       wait.withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class)
		.ignoring(StaleElementReferenceException.class)
		.pollingEvery(Duration.ofSeconds(2))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text"))).click();
						
       driver.findElement(By.id("dest")).sendKeys("Nash");
       wait.withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class)
        .ignoring(StaleElementReferenceException.class)
        .pollingEvery(Duration.ofSeconds(2)) 
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/text[1]"))).click();
       driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
	   driver.findElement(By.xpath(
				"/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/span[1]/div[1]/span[1]"))
				.click();

		driver.findElement(By.id("search_button")).click();

		driver.close();
       
       }


}
