
	package StepDefinition;
	 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	 
	public class InitializeDriver {
		
		protected static WebDriver driver;
	 
	    // Initialize WebDriver in a static block
	    static {
	        if (driver == null) {
	            driver = new EdgeDriver();
	        }
	    }
	 
	}


