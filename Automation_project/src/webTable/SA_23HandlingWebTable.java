package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.WebDriverDemos.BaseFunction;

public class SA_23HandlingWebTable extends BaseFunction{

	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchURL("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement> headers = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));	
		System.out.println(headers.size());
		for(WebElement h:headers) {
			System.out.println(h.getText());
		}
		List<WebElement> b1 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(b1.size());
		for (int i = 0; i < b1.size(); i++) {

			System.out.println(" text from column "+ 
			driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+(i+1)+"]/td[1]/a")).getText()
			);
		}

	driver.close();
	}

}
