package testNGPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.WebDriverDemos.BaseFunction;

public class TNG_07DependsOnMethod extends BaseFunction {
	
	boolean f = true;
    @Test(priority=1)   
	public void Search() {
    	if(f) {
    		throw new SkipException("Skipping");
    	}
		System.out.println("Searching a Phone");
	}
    @Test(priority=2,dependsOnMethods= {"Search"})
	public void Selecting() {
		System.out.println("Selecting a phone");
		
	}
    @Test(priority=3,dependsOnMethods= {"Selecting"})
	public void Checkout() {
		System.out.println("Checking out");
	}
	
}
