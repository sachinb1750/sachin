package suiteBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("::::::::::::::::::");
		System.out.println("Starting Execution");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Ended Execution");
		System.out.println("::::::::::::::::::");
	}
	public String getCurrentDir() {
		String path = System.getProperty("user.dir");
        System.out.println("current dir = " + path);
		return path;
	}
	public String getValuePropFile(String param) throws IOException {
		Properties prop = new Properties();
		String currDir = getCurrentDir();
		String propcurrDir=currDir.replace("\\","\\\\");
		propcurrDir=propcurrDir+"\\\\config\\\\dataconfig.properties";
		System.out.println(propcurrDir);
		FileInputStream fis = new FileInputStream(propcurrDir);
		prop.load(fis);
		return (prop.getProperty(param));
	}
	
}
