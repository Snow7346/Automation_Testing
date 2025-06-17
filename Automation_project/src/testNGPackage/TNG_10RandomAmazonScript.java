package testNGPackage;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.WebDriverDemos.BaseFunction;
  
public class TNG_10RandomAmazonScript extends BaseFunction{
	String ExpectedURL = "https://www.amazn.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
    @BeforeTest(alwaysRun=true)   
	public void openBrowser() {
		launchBrowser("Chrome");
	}
    @BeforeMethod(alwaysRun=true)
	public void openAmazon() {
		launchURL("https://www.amazon.in/");
	}
	@Test(priority=1,groups="Sell")
	public void testSellLink() {
         driver.findElement(By.linkText("Sell")).click();
         screenShot();
		
	}
	@Test(priority=2)
	public void testBestSellerLink() {
		driver.findElement(By.partialLinkText("Best")).click();
		
		String CurrentURL = driver.getCurrentUrl();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(CurrentURL,ExpectedURL,"This URL is invalid");
		System.out.println(CurrentURL);
	}
	@Test(priority=3,groups="Sell")
	public void testElectronicsLink() {
		driver.findElement(By.linkText("Electronics")).click();
		screenShot();
	}
	@Test(priority=4)
	public void testMobilesLink() {
		driver.findElement(By.linkText("Mobiles")).click();
	}
	@AfterMethod(alwaysRun=true)
	public void stopExecution() {
		System.out.println("Execution Done");
	}
	@AfterTest(alwaysRun=true)
	public void closeBrowser() {
		driver.quit();
	}
	public void screenShot() {
		try {
			Date d = new Date();
			String filename = d.toString().replace(":","_").replace(" ","_");
			System.out.println(filename);
	        
			File SSfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(SSfile, new File(filename+".jpeg"));
			File file = new File(filename+".jpeg");
			file.getName();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
