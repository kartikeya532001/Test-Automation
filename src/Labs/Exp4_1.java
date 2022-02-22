//Experiment NO 6
//Register
package Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exp4_1 {
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
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Kartikeya Khanna");
		driver.findElement(By.id("ap_phone_number")).sendKeys("8077754275");
		driver.findElement(By.id("ap_email")).sendKeys("kartikeyakhanna5301@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("kartikeya532001");
		driver.findElement(By.id("ap_password_check")).sendKeys("kartikeya532001");
		driver.findElement(By.id("continue")).click();
	}

	@AfterTest
	public void after() {
		driver.close();
	}
}
