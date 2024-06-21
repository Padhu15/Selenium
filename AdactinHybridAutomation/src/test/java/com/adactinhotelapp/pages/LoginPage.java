package com.adactinhotelapp.pages;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactinhotelapp.base.BasePage;

public class LoginPage extends BasePage{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(xpath="//input[@name='username']")
	 WebElement usernameTextbox;
	
	@FindBy(xpath="//input[@name='password']")
	 WebElement passwordTextbox;
	@FindBy(xpath="//input[@name='login']")
	 WebElement loginButton;
	
	public void userNameTextbox(String text) {
	//	usernameTextbox.sendKeys(text);
		type(usernameTextbox,text);
		
	}
	public void passwordTextbo(String text) {
	//	passwordTextbox.sendKeys(text);
		type(passwordTextbox,text);
		
	}
	
	public void  loginButton() {
		// loginButton.click();
		click(loginButton);
	}
	
	
	
	
	
	
	
}
