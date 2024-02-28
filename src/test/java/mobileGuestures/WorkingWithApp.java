package mobileGuestures;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import driverSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WorkingWithApp {

	public static void main(String[] args) throws MalformedURLException 
	{

		AppiumDriver driver=CreateAppiumSession.initializeSession();
		//before going to these we have to open andriod studio view application and run in command prompt 
		
		//move to view-click on view
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
				
		//Current status of application (go to cmd prompt and type the adb shell and  dumpsys window | group -E mCurrentFocus and copy the app package name
		
		//driver we need to type cast with the AndroidDriver and methodname is queryAppState
		System.out.println("Current application status is:"+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
		
		//terminate the application
		boolean status=((AndroidDriver)driver).terminateApp("io.appium.android.apis");//returns boolean status
		System.out.println("Current status is: "+status);
		
		//Current status of application
		System.out.println("Current application status is:"+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
				
		//unistallation
		((AndroidDriver)driver).removeApp("io.appium.android.apis");
		System.out.println("Application is removed!");
		
		//Current status of application
		System.out.println("Current application status is:"+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
		
		
		//install
		String appPath=System.getProperty("user.dir")+"\\src\\test\\resources\\ApiDemos-debug.apk";
		((AndroidDriver)driver).installApp(appPath);

		System.out.println("Application install!");
		//Current status of application
		System.out.println("Current application status is:"+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
		
		
		//Application run in background
		((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));
		System.out.println("Application is running in background");
		
		//Current status of application
				System.out.println("Current application status is:"+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
