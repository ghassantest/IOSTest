package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.impl.io.MalformedByteSequenceException;
import org.apache.xerces.util.URI.MalformedURIException;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.selendroid.android.AndroidApp;

public class FirstAppiumTest { 
	
	AppiumDriver<WebElement> driver;  
	
	
	@BeforeClass
	
	public void setup() throws MalformedURLException  { 
		
		DesiredCapabilities capabilities = new DesiredCapabilities(); 

		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0.1");
		capabilities.setCapability("deviceName", "name2");
		capabilities.setCapability("app", "/Users/ghassan/Documents/APPIUM_INTRO/app/AUT.apk");
		capabilities.setCapability("appPackage", "com.example.mkim.aut");
		
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities); 

		//DesiredCapabilities cap = new DesiredCapabilities(); 
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator"); 
		//cap.setCapability(MobileCapabilityType.APP_PACKAGE,"com.example.mkim");
		//cap.setCapability("avd", "name2");  
		
		//driver = new AndroidDriver<WebElement> (new URL("http://127.0.0.1:4723/wd/hub"), cap);  
				
	}
	
	
  @Test
  public void SimpleTest() {  
	  

		

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")).click();
		driver.close();
		
		
	// Assert.assertNotNull(driver.getContext());   
	 
	  
	  
  }
}