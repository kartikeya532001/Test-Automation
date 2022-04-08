package Labs;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports
{
	static ExtentTest test;
	static ExtentReports report;
	
	String baseurl = "https://www.amazon.in/";
	String driverpath = "E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe";
	WebDriver chromeDriver;
	
	@BeforeClass
	public static void initializeReport()
	{
		report = new ExtentReports("E:\\UPES\\SEM 6\\Lab\\Test Automation\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	}
	
	@BeforeTest
	public void launchingBrowser()
	{
		System.setProperty("webdriver.chrome.driver", driverpath);
		chromeDriver = new ChromeDriver();
		chromeDriver.get(baseurl);
		chromeDriver.manage().window().maximize();
	}
	
	@Test(priority=0, enabled=true)
	public void verifyingTitle()
	{
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actual = chromeDriver.getTitle();
		
		if(actual.equalsIgnoreCase(expected))
		{
			test.log(LogStatus.PASS, "Title page verified");
		}
		else
		{
			test.log(LogStatus.FAIL, "Title page test failed");
		}
	}
	
	@Test(priority=1, enabled=true)
	public void clickOnSign()
	{
		chromeDriver.findElement(By.id("nav-signin-tooltip")).click();
		
		if(chromeDriver.findElement(By.id("ap_email")) != null)
		{
			test.log(LogStatus.PASS, "Sign On verified");
		}
		else
		{
			test.log(LogStatus.FAIL, "Sign on not verified");
		}
	}
	
	@Test(priority=2, enabled=true)
	public void enterYourLoginName()
	{
		WebElement email = chromeDriver.findElement(By.id("ap_email"));
		email.sendKeys("kartikeya532001@gmail.com");
		
		// continue button would be displayed
		if(chromeDriver.findElement(By.id("continue")) != null)
		{
			test.log(LogStatus.PASS, "Login name entered correctly");
		}
		else
		{
			test.log(LogStatus.FAIL, "Login name is not entered correctly");
		}
	}
	
	@Test(priority=3, enabled=true)
	public void pressContinueAfterLoginNameIsEntered()
	{
		WebElement continueButton = chromeDriver.findElement(By.id("continue"));
		continueButton.click();
		
		if(chromeDriver.findElement(By.id("ap_password")) != null)
		{
			test.log(LogStatus.PASS, "Continue button has been pressed successfully");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Continue button is not pressed correctly");
		}
	}
	
	@Test(priority=4, enabled=true)
	public void enteringPassword()
	{
		WebElement password = chromeDriver.findElement(By.id("ap_password"));
		password.sendKeys("khanna5301");
		
		if(chromeDriver.findElement(By.id("signInSubmit")) != null)
		{
			test.log(LogStatus.PASS, "Sign in button has been located");
		}
		else
		{
			test.log(LogStatus.FAIL, "Sign in button could not be located");
		}
	}
	
	@AfterTest
	public void destroyingSession()
	{
		chromeDriver.close();
		test.log(LogStatus.PASS, "Browser Closed Successfully");
	}
	
	@AfterClass
	public void publishingReport()
	{
		report.endTest(test);
		report.flush();
	}
}
