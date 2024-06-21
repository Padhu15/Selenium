package com.adactinhotelapp.testscripts.regression;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.adactinhotelapp.base.BaseTest;
import com.adactinhotelapp.pages.LoginPage;
import com.adactinhotelapp.pages.SearchHotelPage;

public class ValidateLoginUsingPOM extends BaseTest {

	@Test
	public void validateLoginTest() {

		LoginPage loginPage=PageFactory.initElements(driver,LoginPage.class);
		loginPage.userNameTextbox("reyaz0806");
		loginPage.passwordTextbo("reyaz123");
        loginPage.loginButton();
        
        SearchHotelPage searchhotelpage=PageFactory.initElements(driver, SearchHotelPage.class);
        searchhotelpage.validateTitle("Adactin.com - Search Hotel");
	
	
}}
