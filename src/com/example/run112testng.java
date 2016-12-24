package com.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



public class run112testng {
	AppiumDriver<WebElement> driver;  

	public static void main(String[] args) throws MalformedURLException {
		
		AppiumDriver<WebElement> driver;  


		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0.1");
		capabilities.setCapability("deviceName", "name2");
		capabilities.setCapability("app", "/Users/ghassan/Documents/APPIUM_INTRO/app/AUT.apk");
		capabilities.setCapability("appPackage", "com.example.mkim.aut");
		
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities); 

		

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")).click();
		driver.close();
	}
}
