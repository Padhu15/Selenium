package regression;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.UtilKit;

public class ValidateDataUsingExcelDataProvider02 {

	WebDriver driver;
	FileInputStream fis1;
	Properties configProp;
	
	@BeforeMethod
	public void setup() throws IOException {
	fis1=new  FileInputStream("config.properties");
	configProp=new Properties();
	configProp.load(fis1);
	
	
	String browserName=configProp.getProperty("browser");
	if(browserName.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		}
	else if(browserName.equalsIgnoreCase("edge")) {
		
		driver=new EdgeDriver();
		
	}
	else if(browserName.equalsIgnoreCase("firefox")){
		driver=new FirefoxDriver();
		
	}
	
	driver.get(configProp.getProperty("url"));
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(configProp.getProperty("implicitwait"))));
	driver.findElement(By.linkText("New User Register Here")).click();
	
	
	}
	
	@Test(dataProvider = "getData")
	public void validateLogin(HashMap<String, String> dataMap)
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(dataMap.get("username"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(dataMap.get("password"));
		driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys(dataMap.get("confirmPassword"));
		driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys(dataMap.get("fullname"));
		driver.findElement(By.xpath("//input[@id='email_add']")).sendKeys(dataMap.get("Emailaddress"));
		driver.findElement(By.xpath("//input[@id='captcha-form']")).sendKeys(dataMap.get("Captcha"));
		
		
		Assert.assertEquals(driver.getTitle(), dataMap.get("expTitle"));
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][1];
		
		data[0][0]=UtilKit.getTestDataFromExcel("TC02");
		
		
		
		//10 20 30
		
		
		return data;
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.quit();
		
		
	}
	
}
