package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeAction {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{

		AppiumDriver driver=CreateAppiumSession.initializeSession();

		//view
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//Gallery
		
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		
		//photos
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		//all photos action  id
		WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
		
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			"elementId",((RemoteWebElement)ele).getId(),
			    "direction", "left",
			    "percent", 0.75
			));
		

		
		
		Thread.sleep(2000);//static wait
		
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement)ele).getId(),
				    "direction", "right",
				    "percent", 0.75
				));
			
		
		

	}

}
