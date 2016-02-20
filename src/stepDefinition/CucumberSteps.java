package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps {
	static FirefoxDriver driver;
	@Given("^the browser is launched and we open the url$")
	public void the_browser_is_launched_and_we_open_the_url() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrm.com/index.php/auth/login");
	}

	@When("^we enter the username and password$")
	public void we_enter_the_username_and_password() throws Throwable {
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^we click on the login button$")
	public void we_click_on_the_login_button() throws Throwable {
	   driver.findElement(By.id("btnLogin")).click();
	   
	}

	@Then("^it should diplay the welcome admin msg$")
	public void it_should_diplay_the_welcome_admin_msg() throws Throwable {
	    String exptext="Welcome Admin";
		String acttext=driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(acttext, exptext);
	}
	
	
	@When("^we click on welcome admin$")
	public void we_click_on_welcome_admin() throws Throwable {
		driver.findElement(By.id("welcome")).click();
	}

	@When("^click on Logout$")
	public void click_on_Logout() throws Throwable {
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^home page shoould be diplayed$")
	public void home_page_shoould_be_diplayed() throws Throwable {
	    String expurl="http://opensource.demo.orangehrm.com/index.php/auth/login";
	    String acturl=driver.getCurrentUrl();
	    Assert.assertEquals(acturl, expurl);
	}


	
	
	
	



}
