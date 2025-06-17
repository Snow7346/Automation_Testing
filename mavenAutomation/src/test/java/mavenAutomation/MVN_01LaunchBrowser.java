package mavenAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MVN_01LaunchBrowser {

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://google.co.in");
		  
	}

}
