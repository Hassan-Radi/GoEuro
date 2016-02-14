package com.goeuro.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * A utility class to handle all waiting for elements.
 */
public class WaitUtility {

	public static final String CLASS_NAME = "class name";
	public static final String CSS = "css";
	public static final String ID = "id";
	public static final String LINK_TEXT = "link text";
	public static final String NAME = "name";
	public static final String PARTIAL_LINK_TEXT = "partial link text";
	public static final String TAG_NAME = "tag name";
	public static final String XPATH = "xpath";

	/**
	 * Wait for an element to become visible on the page.
	 * 
	 * @param driver
	 * @param element
	 * @param timeOutInSeconds
	 */
	public static void waitForElementToBeVisible(WebDriver driver,
			WebElement element, long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Wait for an element to become visible on the page and return a reference
	 * to it.
	 * 
	 * @param driver
	 * @param locatorStrategy
	 * @param locator
	 * @param timeOutInSeconds
	 * @return
	 */
	public static WebElement waitForElementToBeVisibleBy(WebDriver driver,
			String locatorStrategy, String locator, long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(getBy(locatorStrategy, locator)));

		// return a reference to the element you just found
		return driver.findElement(getBy(locatorStrategy, locator));
	}

	/**
	 * Converts a locator strategy and locator to a Selenium By object.
	 * 
	 * @param locatorStrategy
	 * @param locator
	 * @return
	 */
	private static By getBy(String locatorStrategy, String locator) {
		switch (locatorStrategy.toLowerCase()) {
			case (CLASS_NAME) :
				return new By.ByClassName(locator);
			case (CSS) :
				return new By.ByCssSelector(locator);
			case (ID) :
				return new By.ById(locator);
			case (LINK_TEXT) :
				return new By.ByLinkText(locator);
			case (NAME) :
				return new By.ByName(locator);
			case (PARTIAL_LINK_TEXT) :
				return new By.ByPartialLinkText(locator);
			case (TAG_NAME) :
				return new By.ByTagName(locator);
			case (XPATH) :
				return new By.ByXPath(locator);
		}

		return null;
	}
}
