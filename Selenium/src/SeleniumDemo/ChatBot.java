package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ChatBot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		driver = new EdgeDriver();
		driver.get("http://ddta.deloitte.com:/fluorescent/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement chatboticon = driver.findElement(By.id("chatbot-iframe"));
		driver.switchTo().frame(chatboticon);
		driver.findElement(By.xpath("//img[@class='float-end rounded-circle']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chatpopup-iframe"));
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//button[text()='Covid Info']")).click();
	}
}