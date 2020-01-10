package com.qa.pages;

import java.util.List;

import org.junit.Assert;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.config.TestBase;


public class CheckoutPage extends TestBase {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="billing_first_name")
	WebElement firstname;
	
	@FindBy(id="billing_last_name")
	WebElement lastname;
	
	@FindBy(id="select2-billing_country-container")
	WebElement country;
	
	@FindAll({@FindBy(xpath="//ul[@id='select2-billing_country-results']/li")})
	List<WebElement> countrylist;
	
	@FindBy(id="billing_city")
	WebElement city;
	
	@FindBy(id="select2-billing_state-container")
	WebElement state;
	
	@FindAll({@FindBy(xpath="//ul[@id='select2-billing_state-results']/li")})
	List<WebElement> statelist;
	
	@FindBy(id="billing_address_1")
	WebElement billingaddress;
	
	@FindBy(id="billing_postcode")
	WebElement billingpostcode;
	
	@FindBy(id="billing_phone")
	WebElement billingphone;
	
	@FindBy(id="billing_email")
	WebElement billingemail;
	
	@FindBy(xpath="//div[@class='woocommerce-terms-and-conditions-wrapper']/p/label")
	WebElement acceptTC;
	
	@FindBy(id="place_order")
	WebElement placeorder;
	
	@FindBy(xpath="//div/p[contains(text(),'Thank you. Your order has been received.')]")
	WebElement message;
	
	@FindBy(xpath="//ul[@class='woocommerce-thankyou-order-details order_details']/li[1]/strong")
	WebElement ordernumber;
	
	
	
	public void firstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void lastname(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void selectcountry(String cname)
	{
		country.click();
		for(WebElement country : countrylist)
		{
			if (country.getText().equals(cname))
			{
				country.click();
				break;
			}
		}
	}
	
	public void city(String cityname)
	{
		city.sendKeys(cityname);
	}
	
	public void selectstate(String sname)
	{
		state.click();
		for(WebElement state : statelist)
		{
			if (state.getText().equals(sname))
			{
				state.click();
				break;
			}
		}
	
	}
	
	public void billingaddress(String billingadd )
	{
		billingaddress.sendKeys(billingadd);
	}
	
	public void billingpostcode(String billingpost)
	{
		billingpostcode.sendKeys(billingpost);
	}
	
	public void billingphone(String billingphon)
	{
		billingphone.sendKeys(billingphon);
	}
	public void billingemail(String billingema)
	{
		billingemail.sendKeys(billingema);
	}
	
	public void TermsandConditionCheckbox() throws InterruptedException
	{
		
Thread.sleep(2000);
acceptTC.click();
	}
	
	public void placeorder()
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",placeorder );
		
		String msg = message.getText();
		
		Assert.assertEquals(msg, "Thank you. Your order has been received.");
		String orderNumber= ordernumber.getText();
		System.out.println("Order Number is :" + orderNumber);
	}
	
	public void closebrowser()
	{
		driver.quit();
	}
	
	public void fillpersonaldetails()
	{
		firstname(prop.getProperty("firstname"));
		lastname(prop.getProperty("lastname"));
		selectcountry(prop.getProperty("country"));
		city(prop.getProperty("city"));
		selectstate(prop.getProperty("state"));
		billingaddress(prop.getProperty("address"));
		billingpostcode(prop.getProperty("postcode"));
		billingphone(prop.getProperty("phone"));
		billingemail(prop.getProperty("email"));	
	}
}

