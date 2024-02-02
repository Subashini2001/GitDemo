package pkgPages;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class Login {
	public static WebDriver driver;
 
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	//login link locator
	By LoginLinkBy=By.linkText("Login");
	By unameBy=By.id("uid");
	By passwordBy=By.id("pwd");
	By loginButtonBy=By.id("submit");
	
	public void loginTC(String uname,String pwd) {
		driver.findElement(LoginLinkBy).click();
		driver.findElement(unameBy).sendKeys(uname);
		driver.findElement(passwordBy).sendKeys(pwd);
		driver.findElement(loginButtonBy).click();
		
	}
 
}