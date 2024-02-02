package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class ContactUs {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		driver = new EdgeDriver();
		driver.get("http://ddta.deloitte.com/fluorescent/");
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		String parentwind = driver.getWindowHandle();
		
		 Set<String> allindis = driver.getWindowHandles();
		
		for(String k:allindis) {
			if(!(k.equals(parentwind))) {
				driver.switchTo().window(k);
				
			}
			}
		driver.switchTo().frame("iframe1");
		
		driver.switchTo().frame("subframe1");
		driver.findElement(By.id("gitButton")).click();
		 allindis = driver.getWindowHandles();
			
			for(String k:allindis) {
				if(!(k.equals(parentwind))) {
					driver.switchTo().window(k);
				}
				}
		
   	  driver.findElement(By.xpath("//div/input[@id='email']")).sendKeys("subashis@deloitte.com");
   	  driver.findElement(By.xpath("//button[text()='Submit form']")).click();
   	  
//   	  driver.findElement(By.id("subject")).sendKeys("sss");
//   	  driver.findElement(By.id("description")).sendKeys("-----");
//   	 driver.findElement(By.className("btn-block")).click();
   	Alert alt = driver.switchTo().alert();
	  System.out.println(alt.getText());
	  alt.dismiss();
	  alt.sendKeys("hii");
	  alt.dismiss();
   	  
		
   	  
		
		}
}
	
	

	


