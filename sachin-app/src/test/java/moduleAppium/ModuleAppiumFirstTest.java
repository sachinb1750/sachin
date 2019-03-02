package moduleAppium;

import org.testng.annotations.Test;

import suiteBase.Appium;

public class ModuleAppiumFirstTest extends Appium{
	@Test
	public void AppiumNativeAppAndroid() {
		System.out.println("ModuleAppiumFirstTest");
		NativeAppAndroid();
	}
	@Test
	public void AppiumIOSApps() {
		System.out.println("ModuleAppiumFirstTest");
		IOSApps();
	}
}
