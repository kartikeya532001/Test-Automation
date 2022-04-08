package Exp_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File {
	public static void main(String[] args) throws IOException
	{
		String username = "";
		String Password = "";
		
		try 
		{
			FileInputStream file = new FileInputStream("E:\\Java\\Test Automation\\Data.xlsx");
			try (XSSFWorkbook wb = new XSSFWorkbook(file)) 
			{
				XSSFSheet sheet = wb.getSheet("Sheet1");
				
				int rowCount = sheet.getLastRowNum();
				
				for(int i = 1; i <= rowCount; i++)
				{
					XSSFRow row = sheet.getRow(i);
					
					if(row.getCell(0).getCellType() == CellType.NUMERIC)
					{
						username = row.getCell(0).getRawValue();
					}
					else
					{
						username = row.getCell(0).toString();
					}
					
					if(row.getCell(1).getCellType() == CellType.NUMERIC)
					{
						Password = row.getCell(1).getRawValue();
					}
					else
					{
						Password = row.getCell(1).toString();
					}
					
					//Password = row.getCell(1).getRawValue();
					
					login(username, Password);
				}
			}
			
			file.close();
		} 
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void login(String username, String Password)
	{
		
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-link-accountList")).click();
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys(username);
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys(Password);
			
		WebElement loginButton = driver.findElement(By.id("signInSubmit"));
		loginButton.click();
		
		driver.close();
		
		
		System.out.println("\n Username: " + username + "\n Password: " + Password);
	}
}
