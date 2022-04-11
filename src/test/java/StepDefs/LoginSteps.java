package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginSteps {
	WebDriver driver = BaseClass.driver;
	@Given("User have opened the application in browser")
	public void user_have_opened_the_application_in_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS); 
	}

	@When("User enter username {string}")
	public void user_enter_username(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.cssSelector("input[name=user-name]"));
		UserName.sendKeys(UserNameVal);
	}
	
	@When("User enter password {string}")
	public void user_enter_password(String PasswordVal) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement Password = driver.findElement(By.cssSelector("input[name=password]"));
	    Password.sendKeys(PasswordVal);
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement LoginBt = driver.findElement(By.cssSelector("input[name=login-button]")); 
	    LoginBt.click();
	}

	@Then("User should be Landed on the home page")
	public void user_should_be_landed_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Welcome to home page");
	}

	@Then("User should get this error {string}")
	public void user_should_get_this_error(String ExpErr) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement err = driver.findElement(By.cssSelector("h3[data-test=error]"));
		String ActErr = err.getText();
		Assert.assertEquals(ActErr, ExpErr);
	}
}
