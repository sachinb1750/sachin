/**
 * ClassName :- CommonFunctions
 * @author sacbhard.
 */
package assessment_AltoroMutual_Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class CommonFunctions extends BaseClass {
	private static String elementName;
	private static String text;

	public static void setCredentials(WebElement userElement, WebElement pwdElement, String user, String pwd) {
		try {
			userElement.sendKeys(user);
			pwdElement.sendKeys(pwd);
			testLevelReport.get().pass("Credentials Set successfully");
			Reporter.log("Credentials Set successfully");
		} catch (Exception e) {
			e.printStackTrace();
			testLevelReport.get().fail("Credentials Set successfully");
			testLevelReport.get().info("Exception");
			testLevelReport.get().debug(e);
		}
	}

	public static void performSendKeys(WebElement element, String keys) {
		try {
			elementName = getElementName(element);
			element.sendKeys(keys);
			testLevelReport.get().pass("Sendkeys performed on Element haveing locater :" + elementName);
			Reporter.log("Sendkeys performed on Element haveing locater : " + elementName);
		} catch (Exception e) {
			e.printStackTrace();
			testLevelReport.get().fail("Sendkeys performed on Element haveing locater :" + elementName);
			testLevelReport.get().info("Exception");
			testLevelReport.get().debug(e);
		}
	}

	public static void performClick(WebElement element) {
		try {
			elementName = getElementName(element);
			element.click();
			testLevelReport.get().pass("Clicked on Element having locater :" + elementName);
			Reporter.log("Clicked on Element having locater :" + elementName);
		} catch (Exception e) {
			e.printStackTrace();
			testLevelReport.get().fail("Clicked on Element having locater :" + elementName);
			testLevelReport.get().info("Exception");
			testLevelReport.get().debug(e);
		}
	}

	public static void verifyElement(WebElement element) {
		try {
			elementName = getElementName(element);
			element.isDisplayed();
			testLevelReport.get().pass("Element is present having locater:" + elementName);
			Reporter.log("Element is present having locater:" + elementName);
			if (element.getText().length() > 0)
				testLevelReport.get().info(element.getText());
			else
				testLevelReport.get().info("::::::::::: Text not Present ::::::::::");
		} catch (Exception e) {
			e.printStackTrace();
			testLevelReport.get().fail("Element is present having locater:" + elementName);
			testLevelReport.get().info("Exception");
			testLevelReport.get().debug(e);
		}
	}

	public static void performSelectElementByValue(WebElement element, String value) {
		try {
			elementName = getElementName(element);
			Select oSelect = new Select(element);
			oSelect.selectByValue(value);
			testLevelReport.get().pass("Element is selected having locater : " + elementName + " and Value : " + value);
			Reporter.log("Element is selected having locater : " + elementName + " and Value : " + value);
		} catch (Exception e) {
			e.printStackTrace();
			testLevelReport.get().fail("Element is selected having locater : " + elementName + " and Value : " + value);
			testLevelReport.get().info("Exception");
			testLevelReport.get().debug(e);
		}
	}

	public static String getElementName(WebElement element) {
		return element.toString().substring(element.toString().lastIndexOf("->") - 1);
	}

	public static boolean verifyDateMMddyy(String dateString, String seprater, String format) {
		boolean flag = false;
		String actualDate;
		try {
			actualDate = dateString.substring(dateString.indexOf(seprater) - 2);
			actualDate = actualDate.substring(0, actualDate.lastIndexOf(seprater) + 3);
			actualDate = actualDate.trim();

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
			LocalDateTime now = LocalDateTime.now();
			String expectedDate = dtf.format(now).toString();

			flag = expectedDate.contains(actualDate);
			testLevelReport.get().pass("String contains Today's Date");
			testLevelReport.get().info(dateString);
			Reporter.log("String contains Today's Date : " + dateString);
		} catch (Exception e) {
			System.out.println("Invalid Date Format");
			e.printStackTrace();
			testLevelReport.get().fail("String contains Today's Date");
			testLevelReport.get().info("Exception");
			testLevelReport.get().debug(e.toString());
		}
		return flag;
	}

	public static void verifyTransaction(List<WebElement> elements, String format, String desc, String amount) {
		String expectedDate = "";
		boolean flag;
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
			LocalDateTime now = LocalDateTime.now();
			expectedDate = dtf.format(now).toString();
			text = "";
			flag = false;
			for (WebElement webElement : elements) {
				text = "";
				for (int i = 0; i < 3; i++) {
					text = text +" : "+ webElement.findElements(By.xpath(".//td")).get(i).getText() +"     ";
				}
				System.out.println(text);
				if (text.contains(expectedDate) && text.contains(desc) && text.contains(amount)) {
					flag = true;
					break;
				} else {
					flag = false;
				}
			}
			if(flag) {
			testLevelReport.get().pass("Transaction is present for amount : " + amount + " ,description : "
					+ desc + " and Date : " + expectedDate);
			testLevelReport.get().info(text);
			Reporter.log("Transaction Found : "+text);
			}else {
				throw new Exception("Transaction Details not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			testLevelReport.get().fail("Transaction is present for amount : " + amount + " ,description : " + desc
					+ " and Date : " + expectedDate);
			testLevelReport.get().info("Exception");
			testLevelReport.get().debug(e);
		}

	}
}
