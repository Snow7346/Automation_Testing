package testNGPackage;

import org.testng.annotations.Test;

import com.WebDriverDemos.BaseFunction;

public class TNG_11ScriptForParallelExecution extends BaseFunction{
	@Test(priority = 1)
	public void openAmazon() {
		launchBrowser("Chrome");
		launchURL("https://www.amazon.in/");
		
	}
	@Test(priority = 2)
	public void OpenFaceBook() {
		launchBrowser("Chrome");
		launchURL("https://www.facebook.com/");
	}

	@Test(priority = 3)
	public void OpenMyntra() {
    	launchBrowser("Chrome");
		launchURL("https://www.myntra.com/");
	}

	@Test(priority = 4)
	public void OpenGoogle() {
		launchBrowser("Chrome");
		launchURL("https://www.google.co.in/");
	}
}
