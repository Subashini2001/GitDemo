package SeleniumDemo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo{
	
	public static WebDriver driver;
 
	public static void main(String[] args) throws InterruptedException {
		driver=new EdgeDriver();
		driver.get("http://ddta.deloitte.com:8080/fluorescent/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(TimeUnit.toMinute(2));
		WebElement Reg_link=driver.findElement(By.linkText("Register"));
		if(Reg_link.isDisplayed()) {
		Reg_link.click();
	}else {
		System.out.println("registration failed");
	}
		WebElement objfname=driver.findElement(By.xpath("\\*@id=\"uname\"]"));
	if(objfname.isEnabled()) {
		objfname.sendKeys("suba01");
	}else
		System.out.println("Full name input field is disabled");
	Thread.sleep(3000);
	driver.close();
	}
	

}



