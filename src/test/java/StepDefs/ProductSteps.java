package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductSteps {
	WebDriver driver = BaseClass.driver;
	@Given("User have opens the application in browser")
	public void user_have_opens_the_application_in_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS); 
	}

	@When("User enters the username {string}")
	public void user_enters_the_username(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.cssSelector("input[name=user-name]"));
		UserName.sendKeys(UserNameVal);
	}

	@When("User enters the password {string}")
	public void user_enters_the_password(String PasswordVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Password = driver.findElement(By.cssSelector("input[name=password]"));
	    Password.sendKeys(PasswordVal);
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginBt = driver.findElement(By.cssSelector("input[name=login-button]")); 
	    LoginBt.click();
	}

	@When("User is on product page")
	public void user_is_on_product_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on PRODUCTS Page.");
	}
	
	@Then("User can see below products with price")
	public void user_can_see_below_products_with_price(DataTable dataTable) {
		//int rows = dataTable.height();
		//System.out.println(rows + "This is the actual hight");
	    //for (int count=0; count<rows-1;count++){
	    //	
	    //	String Product = dataTable.cell(count, 1);
	    //	System.out.println(Product);
	    //	String Prx = dataTable.cell(count, 0);
	    //	System.out.println(Prx);
	    	
	    //}
    	//Assert.assertEquals(Prx, ActPrx);
    	String ActPrd = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
    	//Assert.assertEquals(Product, ActPrd);
    	System.out.print("Product One :" + ActPrd);
		String ActPrx = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/following::div[@class='inventory_item_price'][1]")).getText();
    	System.out.println("Price " + ActPrx);
    	String ActPrd1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).getText();
    	//Assert.assertEquals(Product, ActPrd);
    	System.out.print("Product Two :" + ActPrd1);
		String ActPrx1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']/following::div[@class='inventory_item_price'][1]")).getText();
    	System.out.println("Price " + ActPrx1);

	}


}
