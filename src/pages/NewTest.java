package pages;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test()
  public void testMethod() {
	  String s1="Hello World";
	  
	  String s2="Hello World";
	  
	  String s3="New World";
	  
	  SoftAssert softAssert=new SoftAssert();
	  
	  softAssert.assertEquals(s2, s1);
	  
	  System.out.println("first Assertion is Pass");
	  
	  softAssert.assertEquals(s2, s3);
	  
	  System.out.println("Second Assertion is Pass");
	  
	  softAssert.assertEquals(s1, s2);
	  
	  System.out.println("Third Assertion is Pass");
	  
	  softAssert.assertAll();
  }
  
  /*@Test(priority=0)
  public void testMethod1()
  {
	  System.out.println("In Test Method 2");
  }
  
  @Test(priority=2,description="Test Method 3",invocationCount=2)
  public void testMethod2()
  {
	  System.out.println("In Test Method 3");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("In Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("In After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("In Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("In After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("In Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("In After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("In Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("In After Suite");
  }*/

}
