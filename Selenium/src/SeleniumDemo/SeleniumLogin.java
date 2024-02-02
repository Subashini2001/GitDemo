package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://ddta.deloitte.com:/fluorescent/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(TimeUnit.toMinute(2));
		WebElement Reg_link = driver.findElement(By.linkText("Login"));
WebElement objfname=null;
	if(objfname.isEnabled()) {
		objfname.sendKeys("suba01");
	}else
		System.out.println("Full name input field is disabled");
	Thread.sleep(3000);
	driver.close();
	}
}
