package Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	static WebDriver driver;

	@BeforeTest
	public void beforeCheck() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println();
	}

	@Test
	public void f() {
		SoftAssert softassert = new SoftAssert();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus 9R");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement productText = driver
				.findElement(By.partialLinkText("OnePlus 9R 5G (Lake Blue, 8GB RAM, 128GB Storage)"));
		boolean text = productText.isDisplayed();
		softassert.assertEquals(text, true);
		WebElement p = driver.findElement(By
				.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
		boolean pc = p.isDisplayed();
		softassert.assertEquals(pc, true);
		WebElement img = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span/span[2]/span[1]"));
		boolean imgc = img.isDisplayed();
		softassert.assertEquals(imgc, true);
		WebElement s = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span/span[2]/span[2]"));
		boolean sc = s.isDisplayed();
		softassert.assertEquals(sc, true);
	}
}
