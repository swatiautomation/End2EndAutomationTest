package com.qa.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductListingPage {
	WebDriver driver;
	public ProductListingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
@FindAll({@FindBy(xpath="//div[@class='noo-product-inner']")})
List<WebElement> list;

@FindBy(xpath="//select[@id='pa_color']")
WebElement color;

@FindBy(xpath="//select[@id='pa_size']")
WebElement size;

@FindBy(xpath="//button[@class='single_add_to_cart_button button alt']")
WebElement addtocart;


public void selectproduct(int productNumber)
{
	//////////////click on first product from the search result page//////////////////////
	list.get(productNumber).click();
}

public void selectcolor(String colorName)
{
	
	//////////////select color of the dress///////////////////////////
	Select select = new Select(color);
	select.selectByValue(colorName);
}

public void selectsize(String sizeName)
{
	
	/////////////////select size of the dress/////////////////////////
	Select select1 = new Select(size);
	select1.selectByValue(sizeName);
}
public void addtocart()
{
	
	/////////click on add to cart button//////////////////////////////
	addtocart.click();
}

}
