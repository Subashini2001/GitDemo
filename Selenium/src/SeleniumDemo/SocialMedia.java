package SeleniumDemo;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
 
public class SocialMedia  {
    public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         driver=new EdgeDriver();
         driver.get("http://ddta.deloitte.com/fluorescent/");
         driver.manage().window().fullscreen();
         
        List<WebElement> element = driver.findElements(By.xpath("//div[@class='row social-media-icons-container']/a"));
        for(WebElement i:element) {
        	i.click();
        }
        
         String parentwin=driver.getWindowHandle();
         Set<String> allwind = driver.getWindowHandles();
         for(String k:allwind) {
        	 if(!k.equals(parentwin)) {
        		 driver.switchTo().window(k);
        		 System.out.println(driver.getTitle());
        	 }
         }
         driver.switchTo().window(parentwin);
         //driver.quit();    
         
	}
 
}