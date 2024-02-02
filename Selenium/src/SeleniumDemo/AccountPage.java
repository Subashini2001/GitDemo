package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountPage {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
	       driver.get("http://ddta.deloitte.com:/fluorescent/");
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	  
	    	  driver.findElement(By.id("uname")).sendKeys("Subashini");
	    	  driver.findElement(By.id("email")).sendKeys("subashis@deloitte.com");
	    	  WebElement dob=driver.findElement(By.id("DOB"));
	    	  dob.sendKeys("03/12/2001");
	    	  driver.findElement(By.id("uid")).sendKeys("suba01");
	    	  driver.findElement(By.id("pwd")).sendKeys("HiiHello@0103");
	    	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	    	  Select dropdown = new Select(driver.findElement(By.name("country")));
	    	  dropdown.selectByIndex(0);
	    	  
	    	  

	    	  
	    	  
	    	  
	    	  
	    	  

	}

}
