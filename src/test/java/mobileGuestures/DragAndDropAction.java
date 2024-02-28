 package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragAndDropAction {

	public static void main(String[] args) throws MalformedURLException

	{
		AppiumDriver driver=CreateAppiumSession.initializeSession();

		//view
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//drag and drop option
		
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		
		//first dot
		WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		
		//drag n drop
		
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),
			    "endX",640,
			    "endY",1058 
			));
		
		
		
		String res=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
		System.out.println("After Action Result is: "+res);
		
		
		
		
		
		
		
	}

}
