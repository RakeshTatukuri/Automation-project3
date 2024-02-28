package driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

//second we need to initializesession in inspector
public class CreateAppiumSession 
{
	
	public static AppiumDriver initializeSession() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		//properites
		cap.setCapability("platformName","Android");//key,value
		cap.setCapability("appium:automationName","UiAutomator2");//framework
		cap.setCapability("appium:deviceName","pixel_7");//android studio
		cap.setCapability("appium:udid","emulator-5556");//device name
		
		//application path
		String appPath=System.getProperty("user.dir")+"\\src\\test\\resources\\ApiDemos-debug.apk";
		
		cap.setCapability("appium:app",appPath);
		
		//server connectivity
		
		URL url=new URL("http://0.0.0.0:4723");
		
		//create AppiumSeesion
		AppiumDriver driver=new AndroidDriver(url,cap);
		
		System.out.println("Session id for connected session is: "+driver.getSessionId());
		
		return driver;//we can use these in next method
	}

}

