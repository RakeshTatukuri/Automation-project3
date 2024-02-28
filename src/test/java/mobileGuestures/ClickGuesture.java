package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGuesture {

	public static void main(String[] args) throws MalformedURLException 
	{

		AppiumDriver driver=CreateAppiumSession.initializeSession();
		
		
		//move to view-click on view
		//i want to show you guesture (webelement) not method
		WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Views"));
		
		//click guesture
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele1).getId()
			));
		
		
		System.out.println("Clicked on Views");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
