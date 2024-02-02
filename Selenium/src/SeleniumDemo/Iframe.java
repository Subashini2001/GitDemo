package SeleniumDemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframe {


	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://ddta.deloitte.com:/fluorescent/");
	    driver.manage().window().maximize();
	   List <WebElement> iframelist =driver.findElements(By.tagName("iframe"));
	   System.out.println(driver.findElements(By.tagName("iframe")).size());
	   
	    
	}
	

}
