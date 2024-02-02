package SeleniumDemo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragDrop {

			
		public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
	 
		driver.get("https://www.funkypigeon.com/");
	 
		Thread.sleep(1000);
	 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions a = new Actions(driver);
		
		a.sendKeys(driver.findElement(By.id("algolia_search_input")),"Hii").pause(Duration.ofSeconds(3)).perform();
		
		a.dragAndDropBy(driver.findElement(By.xpath("//div[@class=\"rc-slider-handle rc-slider-handle-1\"]")), 40,0).perform();
		Thread.sleep(1000);
		a.dragAndDropBy(driver.findElement(By.xpath("//div[@class=\"rc-slider-handle rc-slider-handle-2\"]")), -50,0).perform();
		
		
		
		}
	 
	
		 
		 
	      
	    	   }
	       
	


