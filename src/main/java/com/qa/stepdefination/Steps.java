package com.qa.stepdefination;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.config.TestBase;
import com.qa.pages.CartPage;
import com.qa.pages.CheckoutPage;
import com.qa.pages.HomeMainPage;
import com.qa.pages.ProductListingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Steps extends TestBase{
	WebDriver driver;
	CartPage cartpage;
	CheckoutPage checkoutpage;
	HomeMainPage homemainpage;
	ProductListingPage productlistingpage;
	TestBase testbase;
	
	@Given("^user is on Home Page$")
	public void home_page()
	{
		///////////////////////////////code to intialize the browser///////////////////////////////////////
		String browsername =prop.getProperty("browser");
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
					
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();		
			homemainpage = new HomeMainPage(driver);
			homemainpage.NavigateToHomePage();
			
	}
	
	@When("^he search for \"([^\"]*)\" any$")
	public void he_search_for_dress(String arg) {
	
		homemainpage.perform_Search(arg);
	}

	@When("choose to buy the first item")
	public void choose_to_buy_the_first_item() {
 		productlistingpage = new ProductListingPage(driver);		
		productlistingpage.selectproduct(0);
		productlistingpage.selectcolor("white");
		productlistingpage.selectsize("medium");
		productlistingpage.addtocart();
	}

	@When("moves to checkout from mini cart")
	public void moves_to_checkout_from_mini_cart() {
		cartpage = new CartPage(driver);
		
		cartpage.clickoncart();
		cartpage.checkoutbutton();
	}

	@When("enter personal details on checkout page")
	public void enter_personal_details_on_checkout_page() {
		checkoutpage = new CheckoutPage(driver);		
		checkoutpage.fillpersonaldetails();
	}

	@When("^select Term and condition checkbox$")
	public void selectTermsandCondition() throws InterruptedException {
		
		checkoutpage.TermsandConditionCheckbox();
	}

	@When("place the order")
	public void select_payment_method_as_check_payment() {
		
		checkoutpage.placeorder();
	}

	@When("close the browser")
	public void place_the_order() {
		checkoutpage.closebrowser();
	}

}
