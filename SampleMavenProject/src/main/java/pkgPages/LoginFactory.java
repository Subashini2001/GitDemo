package pkgPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public abstract class LoginFactory {
	WebDriver driver;
	public LoginFactory(WebDriver driver) {
	driver=new EdgeDriver();
	driver.get("ddta.deloitte.com:8080/fluorescent/");
	public void loginTC(String uname,String pwd)throws InterruptedException{
		assertTrue
	}
	

}
