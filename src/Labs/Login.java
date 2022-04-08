package Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Login {
	public static void main(String[] args){
		SSbase.setUpBrowser();		
		WebDriver driver = SSbase.generateTest();		
		driver.findElement(By.id("nav-signin-tooltip")).click();
		driver.findElement(By.id("ap_email")).sendKeys("kartikeya532001@gmail.com");
		driver.findElement(By.id("continue")).click(); // Click on continue button
		driver.findElement(By.id("ap_password")).sendKeys("Khanna5301"); // Write password in the text field
		driver.findElement(By.id("signInSubmit")).click(); // Click on sign in button
		SSbase.captureScreenshort(driver);					
		SSbase.tearDown(driver);
	}
}
