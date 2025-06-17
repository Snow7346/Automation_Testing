package wait_mechanism;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.WebDriverDemos.*;
public class SA_21HandlingExplicitWait extends BaseFunction {

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.id("src")).sendKeys("Kolh");
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='autoSuggestContainer']/div/div/div[1]/div/div[1]/ul/li[1]/div/text"))).click();
		driver.findElement(By.id("dest")).sendKeys("Nash");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[@class='placeHolderMainText'][normalize-space()='Nashik']")))
		.click();
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/span[1]/div[1]/span[1]")))
	    .click();
		driver.findElement(By.id("search_button")).click();

	}

}
