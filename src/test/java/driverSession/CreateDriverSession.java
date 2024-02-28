package driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
//first create driver session
public class CreateDriverSession {

	public static void main(String[] args) throws MalformedURLException
	{

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName","Android");//key,value
		cap.setCapability("appium:automationName","UiAutomator2");//framework
		cap.setCapability("appium:deviceName","pixel_7");//android studio
		cap.setCapability("appium:udid","emulator-5556");//device name and we need to start the command prompt
		
		//application path
		String appPath=System.getProperty("user.dir")+"\\src\\test\\resources\\ApiDemos-debug.apk";
		
		cap.setCapability("appium:app",appPath);
		
		//server connectivity
		
		URL url=new URL("http://0.0.0.0:4723");//port number 4723
		
		//create AppiumSeesion
		AppiumDriver driver=new AndroidDriver(url,cap);//android driver platform  
		
		System.out.println("Session id for connected session is: "+driver.getSessionId());
		
		
		
		//OUTPUT: here we can see output in android studio .apk file will open , cmd will check 200 status code ,console
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
