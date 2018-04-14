package com.consciousit.WebAndroidTest;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ConsITLaptopTest {
	//public LaunchCloseWeb launchCloseWeb;
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		//instantiate Chrome Browser driver
		System.setProperty("webdriver.chrome.driver", "/Users/yvonneak/Documents/webDrivers/chrome/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://consciousit.co.uk");
			
		
	}
	
	
	@Test(priority=1)
	public void testDownloadBuy() throws MalformedURLException, InterruptedException {
		
		
		
		//display and access the main navigation menu
		Thread.sleep(3000);
		driver.findElement(By.id("nav-expander")).click();
		//driver.findElement(By.className("pull-right")).click();

		Thread.sleep(3000);
		driver.findElement(By.linkText("FLUSHPRF")).click();
		
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id=\"post-1346\"]/div/div[4]/div[2]/div/div/div[2]/div[2]/div/div/div/button\n")).click();
	}
	
	@Test(priority=2)
	public void tryForFree() throws InterruptedException{

		//Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\'post-1346\']/div/div[4]/div[2]/div/div/div[2]/div[3]/div/div/div/button")).click();
		
		System.out.println("Try for free");
		
		driver.findElement(By.name("email")).sendKeys("gorgeous1@msn.com");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
		

		Thread.sleep(7000);
		String sucsessfulDownloadMsg=driver.findElement(By.tagName("P")).getText();
		System.out.println("Successful Download message " + sucsessfulDownloadMsg);
		//String sucsessfulDownloadMsg2=driver.findElement(By.tagName("div")).getText();
		//Thread.sleep(3000);
		//System.out.println("Successful Download message " + sucsessfulDownloadMsg2);
		
		
		
	}

	//buy the buyFlushPRF
	@Test(priority=3)
	public void buyFlushPRF() throws InterruptedException{

		Thread.sleep(3000);
		driver.get("https://consciousit.co.uk/flushprf/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-1346\"]/div/div[4]/div[2]/div/div/div[2]/div[2]/div/div/div/button")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"buyfrm\"]/div[2]/div/div/div[3]/div[2]/div/div/div[2]/div/div/form/input[3]")).click();
		Thread.sleep(4000);
		String checkouturl=driver.getCurrentUrl();
		System.out.println("we are in the checkout page " + checkouturl);
		
		//clicking on paypal button
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"post-371\"]/div/div[2]/div/table/tbody/tr[5]/td/form/input[7]")).click();
		//Thread.sleep(3000);
		checkouturl=driver.getCurrentUrl();
		
		System.out.println("we are in the paypal page " + checkouturl);
		
		
		
		
	}
	
	
	@AfterTest
	public void afterTest() {
		
		driver.close();
		
	}
	
}
