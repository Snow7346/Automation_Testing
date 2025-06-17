package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class automationExerciseLogin {
	WebDriver driver;
	@Given("The user launch app URL {string}")
	public void the_user_launch_app_url(String URL) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
	}

	@When("The user enters email {string} and password {string}")
	public void the_user_enters_email_and_password(String string, String string2) {
		driver.findElement(By.cssSelector(".login-form [name='email']")).sendKeys(string);
		driver.findElement(By.cssSelector(".login-form [name='password']")).sendKeys(string2);
	}

	@When("The user submits login credentials")
	public void the_user_submits_login_credentials() {
		driver.findElement(By.cssSelector(".login-form [data-qa='login-button']")).click();
	}

	@Then("The user validates logged in Successfully")
	public void the_user_validates_logged_in_successfully() {
		System.out.println(driver.findElement(By.cssSelector(".fa.fa-user")).isEnabled());
	}

	@Then("The user validate logged in successfully")
	public void the_user_validate_logged_in_successfully() {
		System.out.println(driver.findElement(By.cssSelector(".fa.fa-user")).isEnabled());
	}

	@Given("The user launch the application URL {string}")
	public void the_user_launch_the_application_url(String URL) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
	}

	@When("The User enter email {string} and password {string}")
	public void the_user_enter_email_and_password(String string, String string2) {
		driver.findElement(By.cssSelector(".login-form [name='email']")).sendKeys(string);
		driver.findElement(By.cssSelector(".login-form [name='password']")).sendKeys(string2);
	}

	@When("The User submit the login credentials")
	public void the_user_submit_the_login_credentials() {
		driver.findElement(By.cssSelector(".login-form [data-qa='login-button']")).click();
	}

	@Then("The User validate log in successfully")
	public void the_user_validate_log_in_successfully() {
		System.out.println(driver.findElement(By.cssSelector(".fa.fa-user")).isEnabled());
	}




}
