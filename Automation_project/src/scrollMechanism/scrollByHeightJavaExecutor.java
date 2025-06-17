package scrollMechanism;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollByHeightJavaExecutor {
	// first parameter would accepts method
		// second parameter would be elements/ target object.
		//window.scrollBy(0,document.body.scrollHeight) scroll the complete page /browser view point.
		//javaScriptExecutor
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.automationexercise.com/");
		
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)","");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)","");
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-400)","");
		Thread.sleep(3000);
		WebElement subs_Email = driver.findElement(By.id("susbscribe_email"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",subs_Email);
		Thread.sleep(3000);
		subs_Email.sendKeys("arun");
		Thread.sleep(3000);
		driver.close();
	}

}
