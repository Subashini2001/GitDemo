package pkgTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FluroscentAppAutomation {
  @Test(dataProvider = "dp")
  public void test1(Integer n, String s) {
	  System.out.println("The sr.no is: "+n+"Stundent name is: "+s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is a Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is a After method");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is a Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is a After Class");
  }

  @BeforeTest
  public void beforeTest() {
  
  System.out.println("This is a Before Test");
}
  @AfterTest
  public void afterTest() {
	  System.out.println("This is a After Test");
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is a Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is a After Suite");
  }

}
