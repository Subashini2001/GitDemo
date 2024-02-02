package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
import java.util.Set;

public class DiscountCodes {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	       driver=new EdgeDriver();
	       driver.get("http://ddta.deloitte.com:/fluorescent/");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//li[@class='hassubs']/a[text()='Offers']")).click();
	       String parentwin=driver.getWindowHandle();
	       System.out.println(parentwin);
	       System.out.println("****");
	       Set<String> allwinids= driver.getWindowHandles();
	       for(String k:allwinids) {
	    	   if(k.equals(parentwin))
	       continue;
	       driver.switchTo().window(k) ;
	    	   }
	      System.out.println( driver.findElement(By.xpath("//div[@class='table-responsive table-offers']/preceding-sibling::h4")).getText());
	       
	       
	       }     
	       }

