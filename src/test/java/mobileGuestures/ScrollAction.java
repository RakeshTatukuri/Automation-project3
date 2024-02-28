package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollAction {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AppiumDriver driver=CreateAppiumSession.initializeSession();

		//view
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		
		//get all list  where we can perform scroll
		
		WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
		
		//guesture
		boolean statusDown = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "elementId",((RemoteWebElement)ele).getId(),
			    "direction", "down",
			    "percent", 0.80
			));
		
		System.out.println("Status of scroll: "+statusDown);
		
		System.out.println("scroll down!");
		
		
		
		Thread.sleep(2000);//static wait
		
		
		
		
		
		boolean statusup = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "elementId",((RemoteWebElement)ele).getId(),
			    "direction", "up",
			    "percent", 0.80
			));
		
		System.out.println("Status of scroll: "+statusup);
		
		System.out.println("scroll Up!");
		
		
		
		
		
		
		
		
		
		
	}

}
