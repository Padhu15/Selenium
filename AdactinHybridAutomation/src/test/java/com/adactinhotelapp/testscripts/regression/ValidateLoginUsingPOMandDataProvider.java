package com.adactinhotelapp.testscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.adactinhotelapp.base.BaseTest;
import com.adactinhotelapp.pages.LoginPage;
import com.adactinhotelapp.pages.SearchHotelPage;
import com.adactinhotelapp.utils.UtilKit;

public class ValidateLoginUsingPOMandDataProvider extends BaseTest {

	@Test(dataProvider="getData")
	public void validateLoginTest(HashMap<String, String> dataMap) {

		//LoginPage loginPage=PageFactory.initElements(driver,LoginPage.class);
		LoginPage loginPage=new LoginPage();
		loginPage.userNameTextbox(dataMap.get("username"));
		loginPage.passwordTextbo(dataMap.get("password"));
        loginPage.loginButton();
        
      //  SearchHotelPage searchhotelpage=PageFactory.initElements(driver, SearchHotelPage.class);
        SearchHotelPage searchhotelpage =new SearchHotelPage ();
        
        searchhotelpage.validateTitle(dataMap.get("expTitle"));
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][1];
		
		data[0][0]=UtilKit.getTestDataFromExcel("TC01");
		
		return data;
	}


}
