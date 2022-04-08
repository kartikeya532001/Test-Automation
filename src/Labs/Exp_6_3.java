package Labs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exp_6_3 {
  
	 @Test
	  public void test1() {
		  
		  System.out.println("@Test1");
		  
	  }
	  @Test
	  public void test2() {
		  
		  System.out.println("@Test2");
		  
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("@BeforeMethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("@AfterMethod");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("@BeforeTest");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("@AfterTest");
	  }
}
