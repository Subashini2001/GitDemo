
		package SeleniumDemo;
		 
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.edge.EdgeDriver;
		 
		 
		public class Test1 {
			public static WebDriver driver;
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
		       driver=new EdgeDriver();
		       driver.get("http://ddta.deloitte.com:/fluorescent/");
		       driver.manage().window().maximize();
		       
		       driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		  
		    	  driver.findElement(By.id("uname")).sendKeys("Subashini");
		    	  driver.findElement(By.id("email")).sendKeys("subashis@deloitte.com");
		    	  WebElement dob=driver.findElement(By.id("DOB"));
		    	  dob.sendKeys("03/12/2001");
		    	  driver.findElement(By.id("uid")).sendKeys("suba001");
		    	  driver.findElement(By.id("pwd")).sendKeys("HiiHello@0103");
		    	  driver.findElement(By.xpath("//input[@type='submit']")).click();
		    	  
		    	  Thread.sleep(1000);
		    	  WebElement msg =driver.findElement(By.xpath("//div[@id='message']"));
		    	  
		    	  if(msg.isDisplayed()) {
		    		  System.out.println("Successful Registration");
		    	  }
		       
		       
			}
		 
		}
		
