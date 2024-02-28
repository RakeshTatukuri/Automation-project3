package driverSession;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorDemo {

	public static void main(String[] args) throws MalformedURLException
	{
        // here when we compare with selenium the protocol should be same and script should be different
		
		/*
		 * when ever the code is Static we call like these-- classname.methodname()--CreateAppiumSession.initializeSession()
		 * initializeSession return type is AppiumDriver
		 */
		AppiumDriver driver=CreateAppiumSession.initializeSession();

		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//element1 -Access'ibility
		WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
		
		String text1=ele1.getText();
		System.out.println(text1);
		
		ele1.click();
		//Note: when we want to go back to directly home page there is no option/ready made archetecture in selenium/appium
		driver.navigate().back();
		System.out.println("Navigation completed!");
		
		
		//element2 -Accessibility
		WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
		
		System.out.println("Element text is: "+ele2.getText());//get text always return string value
		
		ele2.click();
		
		
		//element2 under accessibility service
		//resouceid value
		 
		//driver.findElement(AppiumBy.id("android:id/text1")).click();//clicked on first option
		//findelements method we use when it is get()
		driver.findElements(AppiumBy.id("android:id/text1")).get(2).click();//if we have multiple elements with same lactors value then we use index i.e get(0) 
		System.out.println("clicked on Accessiblity service");
		
		driver.navigate().back();
		
		//custome view by using className
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(4).click();
		System.out.println("Clicked with class name locator!");
		
	
		
		
		
		
		
		
		//element2
		
//		driver.findElement(AppiumBy.accessibilityId("Accessibility Service")).click();
//		
//		System.out.println("Clicked!");
//		
//		//Navigate
//		
//		driver.navigate().back();
//	
	}

}








