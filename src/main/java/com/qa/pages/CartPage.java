package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/////Locator of the cart page//////////////////////////////

@FindBy(xpath="//span[@class='cart-item has-items']")
WebElement carticon;

@FindBy(xpath="//a[@class='checkout-button button alt wc-forward']")
WebElement checkoutbutton;

public void clickoncart()
{
	
	//click on small cart icon////////////
	carticon.click();
}
public void checkoutbutton()
{
	
/////////////	click on checkout button//////////////
	checkoutbutton.click();
}

}
