package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class Hover {
	public static WebDriver driver;

	public static void main(String[] args )throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("http://ddta.deloitte.com:/fluorescent/");
	    driver.manage().window().maximize();
//	    driver.findElement(By.linkText("Login")).click();
//	    driver.findElement(By.name("uid")).sendKeys("suba01");
//	    driver.findElement(By.name("pwd")).sendKeys("HiiHello@0103");
//	    driver.findElement(By.cssSelector("button#submit")).click();
         Actions a=new Actions(driver);
//	  
//	    a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hi!')]"))).perform();
//	    Thread.sleep(1000);
//	    a.click(driver.findElement(By.linkText("My Profile"))).perform();
	    
	  //  a.sendKeys(driver.findElement(By.cssSelector("input#search-input")),"Selenium").doubleClick().click().pause(Duration.ofSeconds(3)).sendKeys(Keys.BACK_SPACE).build().perform();
      //  a.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[text()='Birthday Cards']"))).keyUp(Keys.CONTROL).build().perform();
        a.scrollToElement(driver.findElement(By.id("subscribe-button"))).perform();
       
	}
}
		

