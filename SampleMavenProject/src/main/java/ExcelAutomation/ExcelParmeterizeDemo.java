package ExcelAutomation;
 
 
	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
import java.io.*;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
 
	public class ExcelParmeterizeDemo {
 
	    public static void main(String[] args) throws InterruptedException {
	        // Set the path to your ChromeDriver executable
	       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
 
	        WebDriver driver = new EdgeDriver();
 
	        try {
	            // Navigate to the login page
	        	driver.get("http://ddta.deloitte.com:8080/fluorescent/index.html");
	        	driver.findElement(By.linkText("Login")).click();
	    		
//	    		Thread.sleep(10000);
	    		
	    		//driver.manage().window().maximize();
	    	//	driver.manage().timeouts().implicitlyWait(TimeUnit.toSeconds(300));
 
	            // Read data from Excel file
	            FileInputStream excelFile = new FileInputStream("C:\\Amydocument\\SDET\\Testdata\\LoginData1.xlsx");
	            Workbook workbook = new XSSFWorkbook(excelFile);
	            Sheet sheet = workbook.getSheet("Sheet1");
 
	            // Iterate through each row starting from the second row (assuming the first row contains headers)
	            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
	                Row dataRow = sheet.getRow(rowIndex);
 
	                // Extract username and password from the current row
	                String username = dataRow.getCell(0).getStringCellValue();
	                String password = dataRow.getCell(1).getStringCellValue();
 
	                // Login with credentials
	                
	        		//driver.findElement(By.linkText("Login")).click();
	                WebElement usernameInput = driver.findElement(By.id("uid"));
	                WebElement passwordInput = driver.findElement(By.id("pwd"));
	                WebElement loginButton = driver.findElement(By.id("submit"));
 
	                // Clear existing input and enter new credentials
	                usernameInput.clear();
	                usernameInput.sendKeys(username);
	                passwordInput.clear();
	                passwordInput.sendKeys(password);
 
	                // Perform login
	                loginButton.click();
	                Thread.sleep(2000);
 
	                // Add any additional logic here based on the specific behavior after login
 
	                // Example: Update Excel with some text
	                Cell newCell = dataRow.createCell(2); // Assuming the third column for storing additional text
	                newCell.setCellValue("Pass");
 
	                // Save the updated workbook after each iteration
	                try (FileOutputStream fileOut = new FileOutputStream("C:\\Amydocument\\SDET\\Testdata\\LoginData.xlsx")) {
	                    workbook.write(fileOut);
	                }
 
	                // Navigate back to the login page for the next iteration
	               // driver.get("http://ddta.deloitte.com:8080/fluorescent/index.html");
	                driver.findElement(By.linkText("Login")).click();
	                
	            }
 
	            // Close the browser after all iterations
	            driver.quit();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}