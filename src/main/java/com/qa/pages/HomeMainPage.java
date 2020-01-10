package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.config.TestBase;

public class HomeMainPage extends TestBase {
	WebDriver driver;
	
	public HomeMainPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void NavigateToHomePage()
	{
		////////////open url "http://shop.demoqa.com/"////////////////////////////
		driver.get(prop.getProperty("eurl"));
	}
	
	public void perform_Search(String search)
	{
		///////////Search Dress in the search box///////////////////////////////////
		driver.navigate().to("http://shop.demoqa.com/?s=" + search + "&post_type=product");
	}

}
