package com.dailySelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateCSSBySpecialCharacters {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("._aa4b._add6._ac4d._ap35")).sendKeys("ahfvahvj");
		driver.findElement(By.cssSelector("input[aria-label^='Pass']")).sendKeys("462375932");
		driver.findElement(By.cssSelector("button[type*='bmi']")).click();
        Thread.sleep(3000);
        driver.close();
	}

}
