package steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefination {
	
	WebDriver driver;
	
	@Given("User Launches the {string} browser")
	public void user_launches_the_browser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
	}

	@Given("User launch app using url {string}")
	public void user_launch_app_using_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	    
	}

	@When("user enters text {string} in textbox using xpath {string}")
	public void user_enters_text_in_textbox_using_xpath(String text, String xpath) {
	  driver.findElement(By.xpath(xpath)).sendKeys(text);
	}

	@When("user clocks on login button using xpath {string}")
	public void user_clocks_on_login_button_using_xpath(String xpath) {
	   driver.findElement(By.xpath(xpath)).click();
	   
	}

	@Then("user validates title to be {string}")
	public void user_validates_title_to_be(String expTitle) {
		Assert.assertEquals(expTitle, driver.getTitle());		
	
	}
@After
public void tearDown() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	driver.quit();
}

@When("user clicks on link using xpath {string}")
public void user_clicks_on_link_using_xpath(String xpath) {
    
	driver.findElement(By.xpath(xpath)).click();
}

@When("user enters text below details in the form")
public void user_enters_text_below_details_in_the_form(DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	List<Map<String, String>> allText=dataTable.asMaps();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(allText.get(0).get("Username"));
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(allText.get(0).get("Password"));
	driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(allText.get(0).get("Confirm Password"));
	driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(allText.get(0).get("Fullname"));
	driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(allText.get(0).get("Email Id"));
	driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(allText.get(0).get("Captcha"));
	
	
	
	
}


}
