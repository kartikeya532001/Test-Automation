//Experiment NO 6
//searching the article 
package Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exp4_2 {
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
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus 9R");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement productText = driver
				.findElement(By.partialLinkText("OnePlus 9R 5G (Lake Blue, 8GB RAM, 128GB Storage)"));
		boolean text = productText.isDisplayed();
		WebElement image = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
		boolean img = image.isDisplayed();
		WebElement priceSysmbol = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span/span[2]/span[1]"));
		boolean Sys = priceSysmbol.isDisplayed();
		WebElement price = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span/span[2]/span[2]"));
		boolean pri = price.isDisplayed();
		System.out.println("Text Displayed: " + text);
		System.out.println("Image Displayed: " + img);
		System.out.println("Price Sysmbol Displayed:" + Sys);
		System.out.println("Price Displayed: " + pri);
	}

	@AfterTest
	public void after() {
		driver.close();
	}
}
