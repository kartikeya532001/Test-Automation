package Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxRegistration
{
	public static void main(String[] args)
	{		
		String driverpath = "E:\\UPES\\SEM 6\\Lab\\Test Automation\\fire\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		
		WebElement customerName = driver.findElement(By.id("ap_customer_name"));
		customerName.sendKeys("kartikeya");
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("kartikeya532001@gmail.com");
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("khanna5301");
		
		try
		{
			WebElement passwordCheck = driver.findElement(By.id("ap_password_check"));
			passwordCheck.sendKeys("khanna5301");
		}
		
		catch(NoSuchElementException E)
		{
			
		}
		
		
		driver.close();
	}
}

