package com.qa.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.util.TestUtil;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase()  {
		try {
		prop = new Properties();
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\config.properties");
		
		prop.load(fi);
		}
		catch(FileNotFoundException e) {
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public  static void	intialization() {
	
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
	
	driver.get(prop.getProperty("eurl"));
	}
}
