package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDefinition {
	WebDriver driver;
	@Given("Lauch application with QA Enviraonment Browser")
	public void lauch_application_with_qa_enviraonment_browser() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver= new EdgeDriver();
		driver.get("http://ddta.deloitte.com/");
		driver.manage().window().maximize();
		}

	@Given("it should be Edge browser")
	public void it_should_be_edge_browser() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
		
	    throw new io.cucumber.java.PendingException();
	}

	@When("click Fluroscent Login button")
	public void click_fluroscent_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	    WebElement objUname=driver.findElement(By.id("submit"));
	}

	@When("check username")
	public void check_username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	    WebElement objUname=driver.findElement(By.id("uid"));
   	 if(objuname.isDisplayed()) {
			Assert.assertTrue(true);
			Reporter.log("Username is to be entered");
   }
	}

	@When("check password")
	public void check_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	    WebElement objUname=driver.findElement(By.id("pwd"));
	    	 if(objuname.isDisplayed()) {
				Assert.assertTrue(true);
				Reporter.log("passsword is to be entered");
	    }
	}

	@Then("validate the presence of Login button")
	public void validate_the_presence_of_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	    WebElement objUname=driver.findElement(By.id("Login Button"));
   	 if(objuname.isDisplayed()) {
			Assert.assertTrue(true);
			Reporter.log("passs is to be entered");
   }
	}

	@Then("Close Browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Launch application with QA Environment Browser")
	public void launch_application_with_qa_environment_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter Username into Abiin step")
	public void enter_username_into_abiin_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter password into Abi@123in step")
	public void enter_password_into_abi_123in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click submit Button")
	public void click_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I verify Logout link")
	public void i_verify_logout_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter Username into Nathiyain step")
	public void enter_username_into_nathiyain_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter password into Nathiya@345in step")
	public void enter_password_into_nathiya_345in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
