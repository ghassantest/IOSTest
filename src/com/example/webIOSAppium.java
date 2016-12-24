package com.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class webIOSAppium { 
	

	
	public static void main(String[] args) throws MalformedURLException {
		
		AppiumDriver<WebElement> driver;  
		
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("deviceName", "iPhone 5s");

		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		 driver = new IOSDriver<WebElement>(url, desiredCapabilities);

		// Navigate to the page and interact with the elements on the guinea-pig page using id.
		driver.get("http://www.layalina.com");
		
		WebElement div = driver.findElement(By.id("i_am_an_id"));
		Assert.assertEquals("I am a div", div.getText()); //check the text retrieved matches expected value
		driver.findElement(By.id("comments")).sendKeys("My comment"); //populate the comments field by id.

		//close the app.
		driver.quit();
		
	// driver.findElement(By.name("Empty list")).click();
 



	}

}



	
//	AppiumDriver<WebElement> driver;  
//
//	public static void main(String[] args) throws MalformedURLException {
//		
//		AppiumDriver<WebElement> driver;  
//
//
//		DesiredCapabilities capabilities = new DesiredCapabilities(); 
//		
//		capabilities.setCapability("appium-version", "1.0");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("platformVersion", "5.0.1");
//		capabilities.setCapability("deviceName", "name2");
//		capabilities.setCapability("app", "/Users/ghassan/Documents/APPIUM_INTRO/app/AUT.apk");
//		capabilities.setCapability("appPackage", "com.example.mkim.aut");
//		
//		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities); 
//
//		
//
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
//		
//		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")).click(); 
//		
//		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")).sendKeys("ghassan");
//		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.EditText[2]")).sendKeys("ghassan"); 
//		
//		driver.close();  
//		
//		
//	}
//}
