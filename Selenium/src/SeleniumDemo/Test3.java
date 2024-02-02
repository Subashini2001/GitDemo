package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test3 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new EdgeDriver();
		driver.get("http://ddta.deloitte.com:8080/fluorescent/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Birthday Cards')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Flowers and Plants')]")).click();
		driver.navigate().back();
		String url=driver.getCurrentUrl();
		if(url.equals("http://ddta.deloitte.com:8080/fluorescent/products.html?cat=cards&type=common")){
			System.out.println("Birthday cards is navigated when clicked on Back button ");
		}
		else
			System.out.println("Failed to verify");
		driver.navigate().forward();
		String url2=driver.getCurrentUrl();
		if(url2.equals("http://ddta.deloitte.com:8080/fluorescent/products.html?cat=FlowersandPlants&type=common")){
			System.out.println("Flower cards is navigated when clicked on Forward button ");
		}
		else
			System.out.println("Failed to verify");
		driver.navigate().refresh();
		if(driver.getCurrentUrl().equals(url2)) {
			System.out.println("Refreshed");
		}
		driver.close();
		}
	
		
	}
