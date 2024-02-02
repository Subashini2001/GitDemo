
		package SeleniumDemo;
		 
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.edge.EdgeDriver;
		 
		//When dob is entered in the future
		public class Test2 {
			public static WebDriver driver;
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
		       driver=new EdgeDriver();
		       driver.get("http://ddta.deloitte.com:8080/fluorescent/");
		       driver.manage().window().maximize();
		       
		       driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		       
		       String register=driver.getCurrentUrl();
		       if(register.equals("http://ddta.deloitte.com:8080/fluorescent/register.html")) {
		    	   System.out.println("Register Page");
		       }
		    	  driver.findElement(By.id("uname")).sendKeys("Subashini");//username
		    	  driver.findElement(By.id("email")).sendKeys("subashis@deloitte.com");//email
		    	  driver.findElement(By.id("DOB")).sendKeys("03/12/2025");//DOB
		    	  driver.findElement(By.id("uid")).sendKeys("suba01");//user id
		    	  driver.findElement(By.id("pwd")).sendKeys("HiiHello@0103"); //password
		    	  driver.findElement(By.xpath("//input[@type='submit']")).click();
		    	  
		    	  WebElement futureDate=driver.findElement(By.xpath("//span[@id='futureDate']"));
		    	  if(futureDate.isDisplayed()) {
		    		  System.out.println("DOB cannot be in future.");
		    	  }
		    	  driver.close();
			}
		 
		

}
