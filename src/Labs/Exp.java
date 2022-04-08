package Labs;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exp {
	public static void main(String[] args) {
		System.out.print("Tanmay Kanwar...500076341");
		System.out.println();
		System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Alienware Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.partialLinkText("Dell Alienware M15 AMD Ryzen R7 5800H 15.6 inches Gaming Laptop (6GB Nvidia RTX Graphics |16GB RAM- 512GB SSD | Windows 10+MS Office - Dark Side of The Moon), 2.42kg")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // control switched to next tab.
		WebElement productText = driver.findElement(By.id("productTitle"));
		System.out.println(productText.getText());
		boolean text = productText.getText().contains("Dell Alienware M15 AMD Ryzen R7 5800H 15.6 inches Gaming Laptop (6GB Nvidia RTX Graphics |16GB RAM- 512GB SSD | Windows 10+MS Office - Dark Side of The Moon), 2.42kg");
		WebElement price = driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div[5]/div[4]/div[4]/div[10]/div[1]/div/table/tbody/tr[2]/td[2]/span[1]/span[2]"));
		System.out.println(price.getText());
		WebElement rating = driver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div[5]/div[4]/div[4]/div[5]/div/span[1]/span/span[1]/a/i[1]"));
		boolean rat = rating.isDisplayed();
		WebElement addChart = driver.findElement(By.id("add-to-cart-button"));
		boolean Chart = addChart.isDisplayed();
		WebElement buynow = driver.findElement(By.id("buy-now-button"));
		boolean buy = buynow.isEnabled();
		WebElement replacement = driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div[5]/div[4]/div[4]/div[22]/div[2]/div/div/div/div[1]/span/div[2]/a"));
		boolean replace = replacement.isDisplayed();
		System.out.println("Text Displayed: " + text);
		System.out.println("Rating: " + rat);
		System.out.println("Add Chart Button: " + Chart);
		System.out.println("Buy Now Button: " + buy);
		System.out.println("Replace Button: " + replace);
		driver.switchTo().window(tabs.get(0)); // control back to original tab.
		driver.quit();
	}
}
