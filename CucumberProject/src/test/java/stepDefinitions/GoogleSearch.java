package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
  WebDriver driver;
@Given("User launch app URL {string}")
public void user_launch_app_url(String URL) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(URL);
}

@When("the User enters data in search box {string}")
public void the_user_enters_data_in_search_box(String string) {
	driver.findElement(By.name("q")).sendKeys(string);
}

@When("hit Enter")
public void hit_enter() {
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}

@Then("the valid search result should display")
public void the_valid_search_result_should_display() {
	driver.getTitle().contains("Sachin");
}

}
