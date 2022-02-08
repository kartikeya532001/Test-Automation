//Experiment NO 2
package Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp1_1 {

	public static void main(String[] args) {
		System.out.print("Kartikeya Khanna...500078285");
		System.out.println();
		System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-signin-tooltip")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Kartikeya Khanna");
		driver.findElement(By.id("ap_phone_number")).sendKeys("8077754275");
		driver.findElement(By.id("ap_email")).sendKeys("kartikeyakhanna5301@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("kartikeya532001");
		driver.findElement(By.id("ap_password_check")).sendKeys("kartikeya532001");
		driver.findElement(By.id("continue")).click();

	}

}
