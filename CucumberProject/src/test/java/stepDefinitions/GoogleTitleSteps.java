package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
     
public class GoogleTitleSteps {
	
	 WebDriver driver;
	@Given("The User Launch the Googel URL")
	public void the_user_launch_the_googel_url() {
	   System.out.println("LaunchGoogle");
	}

	@When("The User gets Page Title")
	public void the_user_gets_page_title() {
	 System.out.println("PageTitle");
	}

	@Then("The User validate Page Title")
	public void the_user_validate_page_title() {
	    System.out.println("validate");
	}

@Given("The User Launch the Google URL")
public void the_user_launch_the_google_url() {
      driver = new ChromeDriver();
      driver.get("https://google.co.in");
}

@When("The User click on Gmail Link")
public void the_user_click_on_gmail_link() {
     
}

@Then("The Gmail Page should be opened")
public void the_gmail_page_should_be_opened() {
   
}

}
