package com.primusbank.constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class PrimusBankConstants 
{
	public static WebDriver driver;
	public static String url="http://primusbank.qedgetech.com";
	
	@BeforeSuite
	public static void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\personal\\Automation\\jars\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(url);
	}
	
	@AfterSuite
	public static void closeApp()
	{
		driver.close();
	}
	
}
