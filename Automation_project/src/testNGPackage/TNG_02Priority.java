package testNGPackage;

import org.testng.annotations.Test;

public class TNG_02Priority {


	@Test(priority = 1)
	public void setupBrowser() {
		System.out.println("Launch Browser");
	}

	@Test(priority = 2)
	public void setUpAppURL() {
		System.out.println("Launch URL");
	}

	@Test(priority = 3)
	public void registeration() {
		System.out.println("register Testcase");
	}

	@Test(priority = 4)
	public void login() {
		System.out.println("Login Testcase");
	}


}
