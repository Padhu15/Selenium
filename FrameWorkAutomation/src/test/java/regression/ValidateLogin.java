package regression;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateLogin {
	
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
	
	}
@Test
public void ValidateLoginTest1() {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0806");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
	driver.findElement(By.xpath("//input[@name='login']")).click();
	Assert.assertEquals(driver.getTitle(),"Adactin.com - Search Hotel" );
	
}
@Test
public void ValidateLoginTest2() {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0800");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
	driver.findElement(By.xpath("//input[@name='login']")).click();
	Assert.assertEquals(driver.getTitle(),"Adactin.com - Hotel Reservation System" );
	
}
@Test
public void ValidateLoginTest3() {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0806");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz12");
	driver.findElement(By.xpath("//input[@name='login']")).click();
	Assert.assertEquals(driver.getTitle(),"Adactin.com - Hotel Reservation System" );
	
}@Test
public void ValidateLoginTest4() {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0800");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz13");
	driver.findElement(By.xpath("//input[@name='login']")).click();
	Assert.assertEquals(driver.getTitle(),"Adactin.com - Hotel Reservation System" );
	
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
