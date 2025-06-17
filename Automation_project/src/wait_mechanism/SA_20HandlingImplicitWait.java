package wait_mechanism;
import com.WebDriverDemos.*;
		import org.openqa.selenium.By;

		import java.time.Duration;

		public class SA_20HandlingImplicitWait extends BaseFunction {

		    public static void main(String[] args) {
		       launchBrowser("Chrome");
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		       launchURL("https://www.redbus.in/");

				// Source City
				driver.findElement(By.id("src")).sendKeys("Kolh");

				driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text"))
						.click();

				// targetCity
				driver.findElement(By.id("dest")).sendKeys("Nash");

				driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]/div/text"))
						.click();
				
				// select the calender
				driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
				driver.findElement(By.xpath(
						"/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/span[1]/div[3]/span[1]"))
						.click();

				driver.findElement(By.id("search_button")).click();
				
				
				driver.close();


		    }

	}

