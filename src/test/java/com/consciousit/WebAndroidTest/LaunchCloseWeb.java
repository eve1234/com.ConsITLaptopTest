package com.consciousit.WebAndroidTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;



import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class LaunchCloseWeb {
	
	AndroidDriver driver;
	
	@BeforeTest
	public void beforeTestCap() throws MalformedURLException {
		File f = new File("/Users/yvonneak/Documents/AutomationFiles/appiumJar/com.android.chrome_60.0.3112.107-311210711_minAPI21(x86)(nodpi)_apkmirror.com.apk");
		
		DesiredCapabilities caps= new DesiredCapabilities();
		
		caps.setCapability("plateformName", "ANDROID");
		caps.setCapability("deviceName", "android Device");
		caps.setCapability("app", f);
		//caps.setCapability("platformVersion", "");
		caps.setCapability("browserName", "chrome");
		caps.setCapability("appPackage","com.android.chrome");
		//caps.setCapability("appActivity" , "com.android.chrome.BrowserActivity");
		//instantiate the driver
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
	}
	
	@AfterTest
	public void afterTestCap() {
		
		driver.close();
		
	}
	
	

}
