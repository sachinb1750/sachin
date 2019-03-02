package suiteBase;

import org.testng.annotations.BeforeTest;

public class Appium {
	@BeforeTest(groups="android")
	public void NativeAppAndroid() {
		System.out.println("NativeAppAndroid");
	}
	@BeforeTest(groups="iOS")
	public void IOSApps() {
		System.out.println("IOSApps");
	}
}
