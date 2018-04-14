package com.consciousit.WebAndroidTest;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

/**
 *appium for mobile web.
 */
public class ConsITTest1{ 
	public LaunchCloseWeb launchCloseWeb;
	//LaunchCloseWeb launchCloseWeb;
	@Test(priority=1)
	public void testPurchase() throws MalformedURLException, InterruptedException {
		launchCloseWeb = new LaunchCloseWeb();
		launchCloseWeb.beforeTestCap();
		launchCloseWeb.driver.get("https://consciousit.co.uk");
		
		//display and access the main navigation menu
		Thread.sleep(3000);
		launchCloseWeb.driver.findElement(By.id("nav-expander")).click();
		
		Thread.sleep(3000);
		launchCloseWeb.driver.findElement(By.linkText("FLUSHPRF")).click();
		
		//= new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
		Thread.sleep(3000);
	}
	
	//try the app for free
	@Test(priority=2)
	public void tryForFree() throws InterruptedException{

		Thread.sleep(3000);
		//launchCloseWeb.driver.findElementByClassName("android.view.View").click();
		//launchCloseWeb.driver.
		JavascriptExecutor js = (JavascriptExecutor)launchCloseWeb.driver;
		js.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(3000);
		
		//launchCloseWeb.driver.findElementByXPath("android.widget.Button['Try Free']").click();
		launchCloseWeb.driver.findElementByXPath("//android.widget.Button[@content-desc='Try Free']").click();
		//launchCloseWeb.driver.findElementByXPath("//android.view.View[@index='Try Free']").click();
		System.out.println("Try for free");
	}
	/*
	//buy the buyFlushPRF
	@Test(priority=3)
	public void buyFlushPRF() throws InterruptedException{

		Thread.sleep(3000);
		launchCloseWeb.driver.findElement(By.linkText("Buy Now")).click();
		System.out.println("Buy Now");
		
	}*/
	
	
	
  
}
