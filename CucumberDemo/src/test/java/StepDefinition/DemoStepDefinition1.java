package StepDefinition;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class DemoStepDefinition1 {
	
	WebDriver driver;
	@When("Enter Username into {string} in step")
	public void enter_username_into_in_step(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		 driver.findElement(By.id("uid")).sendKeys(string);
	}
 
	@When("Enter pwassword into {string} in step")
	public void enter_pwassword_into_in_step(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	   driver.findElement(By.id("pwd")).sendKeys(string);
	
	}
	
 
 
	@When("click Submit Button")
	public void click_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	          
	}
	
 
	@Then("I verify Logout link")
	public void i_verify_logout_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	   WebElement objlogout= driver.findElement(By.linkText("Logout"));
	}
 
 
 
 
}
 