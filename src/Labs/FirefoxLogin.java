package Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLogin
{
	public static void main(String[] args)
	{
		
		String driverpath = "E:\\UPES\\SEM 6\\Lab\\Test Automation\\fire\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-link-accountList")).click();
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("kartikeya532001@gmail.com");
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Khanna5301");
			
		WebElement loginButton = driver.findElement(By.id("signInSubmit"));
		loginButton.click();
		
		driver.close();
	}
}


