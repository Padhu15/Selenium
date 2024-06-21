package com.adactinhotelapp.pages;

 

import org.openqa.selenium.support.PageFactory;

import com.adactinhotelapp.base.BasePage;

public class SearchHotelPage  extends BasePage{
public SearchHotelPage(){
	PageFactory.initElements(driver, this);
	}
}
