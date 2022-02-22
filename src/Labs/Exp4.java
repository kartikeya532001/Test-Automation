//Experiment NO 6
//Signing
package Labs;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp4 {
	WebDriver driver;

	@BeforeTest
	public void before() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}

	@Test
	public void login() {

		driver.findElement(By.id("nav-signin-tooltip")).click();
		driver.findElement(By.id("ap_email")).sendKeys("kartikeya532001@gmail.com");
		driver.findElement(By.id("continue")).click(); // Click on continue button
		driver.findElement(By.id("ap_password")).sendKeys("Khanna5301"); // Write password in the text field
		driver.findElement(By.id("signInSubmit")).click(); // Click on sign in button

	}

	@AfterTest
	public void after() {
		driver.close();
	}

}
