package regression;

import org.testng.annotations.Test;

import keywords.ApplicationKeywords;

public class ValiateLoginUsingKeyWords {
	@Test
	public void validateLoginTest()
	{
		ApplicationKeywords app=new ApplicationKeywords();
		
		app.openBrowser();
		
		app.launchApp();
		
		app.type("username_textbox", "reyaz0806");
		
		app.type("password_textbox", "reyaz123");
		
		app.click("login_button");
		
		app.validateTitle("Adactin.com - Search Hotel");
		}
}
