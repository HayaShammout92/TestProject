package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.microsoft.appcenter.appium.Factory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class AppuimTest {

	@BeforeClass @Rule
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
	    TestWatcher watcher = Factory.createWatcher();
		AppiumDriver<MobileElement> driver;
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Note5");
		caps.setCapability(MobileCapabilityType.UDID, "01171155526b4001"); //Give Device ID of your mobile phone
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		caps.setCapability(MobileCapabilityType.APP, "D:\\com.nama.androidapp.apk");
		caps.setCapability(MobileCapabilityType.NO_RESET, true);
		
		driver = Factory.createAndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		System.out.println("DONE");
			}
	}
