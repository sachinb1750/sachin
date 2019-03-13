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

	public static void setCredentials(WebElement userElement, WebElement pwdElement, String user, String pwd)
			throws Exception {
		try {
			userElement.sendKeys(user);
			pwdElement.sendKeys(pwd);
			testLevelReport.get().pass("Credentials Set successfully");
			Reporter.log("<br>Credentials Set successfully : Passed");
		} catch (Exception e) {
			e.printStackTrace();
			testLevelReport.get().fail("Credentials Set successfully");
			testLevelReport.get().info("Exception");
			testLevelReport.get().debug(e);
			Reporter.log("<br>Credentials Set successfully : Failed");
			Reporter.log("<br>Exception Occured : <br>");
			Reporter.log(e.toString());
			throw new Exception();
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

	public static void performClick(WebElement element) throws Exception {
		try {
			elementName = getElementName(element);
			element.click();
			testLevelReport.get().pass("Clicked on Element having locater :" + elementName);
			Reporter.log("<br>Clicked on Element having locater :" + elementName + " : Passed");
		} catch (Exception e) {
			e.printStackTrace();
			testLevelReport.get().fail("Clicked on Element having locater :" + elementName);
			testLevelReport.get().info("Exception");
			testLevelReport.get().debug(e);
			Reporter.log("<br>Clicked on Element having locater :" + elementName + " : Failed");
			Reporter.log("<br>Exception Occured : <br>");
			Reporter.log(e.toString());
			throw new Exception();
		}
	}

	public static String verifyElement(WebElement element) throws Exception {
		try {
			elementName = getElementName(element);
			element.isDisplayed();
			Reporter.log("<br>Element is present having locater:" + elementName);
			if (element.getText().length() > 0) {
				Reporter.log("<br>With Value : " + element.getText() + "<br> : Passed");
			}
			return element.getText();
		} catch (Exception e) {
			e.printStackTrace();
			testLevelReport.get().fail("Element is present having locater:" + elementName);
			testLevelReport.get().info("Exception");
			testLevelReport.get().debug(e);
			Reporter.log("<br>Element is present having locater:" + elementName);
			Reporter.log("<br>With Value : " + element.getText() + "<br> : Failed");
			Reporter.log("<br>Exception Occured : <br>");
			Reporter.log(e.toString());
			throw new Exception();
		}
	}

	public static void performSelectElementByValue(WebElement element, String value) throws Exception {
		try {
			elementName = getElementName(element);
			Select oSelect = new Select(element);
			oSelect.selectByValue(value);
			testLevelReport.get().pass("Element is selected having locater : " + elementName + " and Value : " + value);
			Reporter.log("<br>Element is selected having locater : " + elementName + " and Value : " + value);
			Reporter.log("<br>With Value : " + element.getText() + "<br> : Passed");
		} catch (Exception e) {
			e.printStackTrace();
			testLevelReport.get().fail("Element is selected having locater : " + elementName + " and Value : " + value);
			testLevelReport.get().info("Exception");
			testLevelReport.get().debug(e);
			Reporter.log("<br>Element is selected having locater : " + elementName + " and Value : " + value);
			Reporter.log("<br>With Value : " + element.getText() + "<br> : Failed");
			Reporter.log("<br>Exception Occured : <br>");
			Reporter.log(e.toString());
			throw new Exception();
		}
	}

	public static String getElementName(WebElement element) {
		return element.toString().substring(element.toString().lastIndexOf("->") - 1);
	}

	public static boolean verifyTodayDateMMddyy(String dateString, String seprater, String format) throws Exception {
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
			Reporter.log("<br>String contains Today's Date : " + dateString + " : Passed");

		} catch (Exception e) {
			System.out.println("Invalid Date Format");
			e.printStackTrace();
			testLevelReport.get().fail("String contains Today's Date");
			testLevelReport.get().info("Exception");
			testLevelReport.get().debug(e.toString());
			Reporter.log("<br>String contains Today's Date : " + dateString + " : Failed");
			Reporter.log("<br>Exception Occured : <br>");
			Reporter.log(e.toString());
			throw new Exception();
		}
		return flag;
	}

	public static boolean verifyTransaction(List<WebElement> elements, String format, String desc, String amount)
			throws Exception {
		String expectedDate = "";
		boolean flag = false;
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
			LocalDateTime now = LocalDateTime.now();
			expectedDate = dtf.format(now).toString();
			text = "";
			flag = false;
			for (WebElement webElement : elements) {
				text = "";
				for (int i = 0; i < 3; i++) {
					text = text + " : " + webElement.findElements(By.xpath(".//td")).get(i).getText() + "     ";
				}
				if (text.contains(expectedDate) && text.contains(desc) && text.contains(amount)) {
					flag = true;
					break;
				} else {
					flag = false;
				}
			}
			if (flag) {
				testLevelReport.get().pass("Transaction is present for amount : " + amount + " ,description : " + desc
						+ " and Date : " + expectedDate);
				testLevelReport.get().info(text);
				Reporter.log("<br>Transaction Found : " + text + " : Passed");
				System.out.println("Transaction Details : " + text);
			} else {
				Reporter.log("Transaction Details not found");
				throw new Exception("Transaction Details not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			testLevelReport.get().fail("Transaction is present for amount : " + amount + " ,description : " + desc
					+ " and Date : " + expectedDate);
			testLevelReport.get().info("Exception");
			testLevelReport.get().debug(e);
			Reporter.log("<br>Transaction Found : " + text + " : Failed");
			Reporter.log("<br>Exception Occured : <br>");
			Reporter.log(e.toString());
			throw new Exception();
		}
		return flag;

	}
}
