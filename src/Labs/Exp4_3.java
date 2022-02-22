//Experiment NO 6
//for navigating to the article  details page 
package Labs;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exp4_3 {
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
		driver.findElement(By.partialLinkText("OnePlus 9R 5G (Lake Blue, 8GB RAM, 128GB Storage)")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // control switched to next tab.
		WebElement productText = driver.findElement(By.id("productTitle"));
		System.out.println(productText.getText());
		boolean text = productText.getText().contains("OnePlus 9R 5G (Lake Blue, 8GB RAM, 128GB Storage");
		WebElement price = driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div[5]/div[3]/div[4]/div[10]/div[1]/div/table/tbody/tr[1]/td[2]/span[1]/span[2]"));
		System.out.println(price.getText());
		WebElement rating = driver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div[5]/div[3]/div[4]/div[5]/div/span[1]/span/span[1]/a/i[1]"));
		boolean rat = rating.isDisplayed();
		WebElement addChart = driver.findElement(By.id("add-to-cart-button"));
		boolean Chart = addChart.isDisplayed();
		WebElement buynow = driver.findElement(By.id("buy-now-button"));
		boolean buy = buynow.isEnabled();
		WebElement replacement = driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div[5]/div[3]/div[4]/div[22]/div[2]/div/div/div/div[1]/span/div[1]/img"));
		boolean replace = replacement.isDisplayed();
		WebElement specs = driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div[5]/div[3]/div[4]/div[34]/div[1]/div/form/div[1]/ul/li[1]/span/div/span/span/span/button/div/div[1]/p"));
		System.out.println(specs.getText());
		boolean spe = specs.getText().contains("12GB RAM,256GB Storage");
		boolean speb = specs.isEnabled();
		System.out.println("Text Displayed: " + text);
		System.out.println("Rating: " + rat);
		System.out.println("Add Chart Button: " + Chart);
		System.out.println("Buy Now Button: " + buy);
		System.out.println("Replace Button: " + replace);
		System.out.println("Specs Displayed correct: " + spe);
		System.out.println("Specs Button working: " + speb);
		driver.switchTo().window(tabs.get(0)); // control back to original tab.
	}

	@AfterTest
	public void after() {
		driver.close();
	}
}
