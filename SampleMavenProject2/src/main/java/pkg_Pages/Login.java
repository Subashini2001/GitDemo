package pkg_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	public static WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
		
	}
	//login link locator
	By LoginLinkBy=By.linkText("Login");
	//username input locator
	By unameBy=By.id("uid");
	//password locator
	By passwordBy=By.id("pwd");
	//login button locator
	By loginButtonBy=By.id("submit");
	private By loginbutton;
     public void LoginTC(String uname,String password) {
    	 driver.findElement(LoginLinkBy).click();
         driver.findElement(unameBy).sendKeys(uname);
         driver.findElement(passwordBy).sendKeys(password);
         driver.findElement(loginbutton).submit();
         
         
	
}
}
