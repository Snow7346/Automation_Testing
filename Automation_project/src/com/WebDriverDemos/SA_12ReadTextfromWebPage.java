package com.WebDriverDemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SA_12ReadTextfromWebPage {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	    driver.findElement(By.id("txtCustomerID")).sendKeys("hasdhsvujas");
	    driver.findElement(By.id("txtPassword")).sendKeys("327632978");
	    driver.findElement(By.id("Butsub")).click();
	    String Errmsg = driver.findElement(By.id("lblMsg")).getText();
	    System.out.println(Errmsg);
	    if(Errmsg.contains("Invalid"))
	    System.out.println("Test Case pass");
	    else
	    System.out.println("Test case fails");
	    Thread.sleep(2000);
	    driver.close();

	}

}
