package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
	
public class ForgotPasswordValidation{
		
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
	
		driver=new EdgeDriver();
		driver.get("http://ddta.deloitte.com/fluorescent/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.partialLinkText("password")).click();
		driver.findElement(By.id("uid")).sendKeys("suba01");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block mb-3']")).click();
		
		String message=driver.findElement(By.id("message")).getText();
		String[] arr=message.split(" - ");
		String password=arr[1].substring(0,arr[1].length() -1);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.name("uid")).sendKeys("suba01");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
        driver.findElement(By.className("btn-block")).click();
		
		String loginmsg = driver.findElement(By.xpath("//ul[@class='standard_dropdown top_bar_dropdown']/li/span")).getText();
		
		if(loginmsg.contains("Hi!!")) {
			System.out.println("Test Case is Passed");
		}else {
			System.out.println("Test Case is Failed");
		}
	}
	
	
}
		



