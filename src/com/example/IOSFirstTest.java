// Working  
// this is for git 
package com.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;



public class IOSFirstTest { 
	
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		RemoteWebDriver driver;   
		// this is for git
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("appium-version", "1.0");

		capabilities.setCapability("platformName", "iOS");

		capabilities.setCapability("platformVersion", "8.4");

		capabilities.setCapability("deviceName", "iPhone 5s");

		capabilities.setCapability("app", "/Users/ghassan/Library/Developer/Xcode/DerivedData/iPhoneCalculator-dtexkpholoohcxcwprvnzhawlnkt/Build/Products/Debug-iphonesimulator/iPhoneCalculator.app");
		

	 driver = new IOSDriver (new URL("http://0.0.0.0:4723/wd/hub"), capabilities); 

	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]/UIATextField[1]")).sendKeys("ghassan");
//	
//	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]/UIATextField[1]")).sendKeys("ghassanghassah");  
	 
		//driver.findElement(By.name("8")).click(); 
	 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.name("7")).click(); 
		
		driver.findElement(By.name("×")).click();
		
		driver.findElement(By.name("8")).click();
		
		driver.findElement(By.name("=")).click();
		
		
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
