package Labs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exp_6_2 {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeLogin() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	

  @Test(dataProvider = "class1")
  public void inclassSignin(String email, String password) {
	  	driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-signin-tooltip")).click();
		driver.findElement(By.id("ap_email")).sendKeys(email);		
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
  }
  
  @DataProvider(name = "class1")
  public static Object[][] login() {
	  Object data[][] = new Object[2][2];
	  data[0][0]="kartikeya532001@gmail.com";
	  data[0][1]="kartikeya532001@gmail.com";
	  data[1][0]="Khanna5301";
	  data[1][1]="Khanna5301";
	  
	  return data;
  }
  
  @AfterTest
	public void afterLogin() {
		driver.close();
	}
}