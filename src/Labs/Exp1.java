//Experiment NO 2
package Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp1 {

	public static void main(String[] args) {
		System.out.print("Kartikeya Khanna...500078285");
		System.out.println();
		System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-signin-tooltip")).click();
		driver.findElement(By.id("ap_email")).sendKeys("kartikeya532001@gmail.com");
		driver.findElement(By.id("continue")).click(); // Click on continue button
		driver.findElement(By.id("ap_password")).sendKeys("Khanna5301"); // Write password in the text field
		driver.findElement(By.id("signInSubmit")).click(); // Click on sign in button

	}

}
