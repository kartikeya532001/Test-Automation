package Labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Reporter;


public class Logs {
	static WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Reporter.log("Browser is now opened",true);		
		driver.manage().window().maximize();
		Reporter.log("Browser is now maximized",true);		
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon is now opened",true);		
		driver.close();
		Reporter.log("Browser is now closed",true);
  }
}
