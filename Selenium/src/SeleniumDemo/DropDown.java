package SeleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {


		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
		       driver=new EdgeDriver();
		       driver.get("http://ddta.deloitte.com:8080/fluorescent/myProfilejsp.jsp");
		       driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		       
		       Select dropdown=new Select(driver.findElement(By.id("country")));
		       dropdown.selectByIndex(2);
		       Thread.sleep(1000);
		       dropdown.selectByValue("Nepal");
		       Thread.sleep(1000);
		       dropdown.selectByVisibleText("India");
		       Thread.sleep(1000);
		       System.out.println(dropdown.isMultiple());
		      
				driver.findElement(By.linkText("Birthday Cards")).click();
				driver.findElement(By.id("customDropdown")).click();
		     
				Select mslt = new Select(driver.findElement(By.id("cards")));
				mslt.selectByIndex(0);
				mslt.selectByValue("Brother");
				Thread.sleep(3000);
				mslt.selectByVisibleText("Dad");
				Thread.sleep(3000);

				mslt.deselectByIndex(3);
				Thread.sleep(3000);

				mslt.deselectByValue("Dad");
				Thread.sleep(3000);

				mslt.deselectByVisibleText("Brother");
				Thread.sleep(3000);
				mslt.deselectAll();
				Thread.sleep(3000);
				System.out.println(mslt.isMultiple());
				
				
				
		      
		       
		      
		      
		       
		       
		       
		       
		       
		       

	}

}
