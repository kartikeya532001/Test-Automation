package Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Exp6_1 {
  @Test(dataProviderClass=Exp6.class, dataProvider= "dataprovider1")
  public void Test(String id, String pass) {
	  System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-signin-tooltip")).click();
		driver.findElement(By.id("ap_email")).sendKeys(id);
		driver.findElement(By.id("continue")).click(); // Click on continue button
		driver.findElement(By.id("ap_password")).sendKeys(pass); // Write password in the text field
		driver.findElement(By.id("signInSubmit")).click(); // Click on sign in button
	System.out.println("UserName: "+id );
	System.out.println("Pass: "+pass);
  }
}
