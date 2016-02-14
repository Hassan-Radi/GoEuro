package com.goeuro.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * A utility class to handle all waiting for elements.
 */
public class WaitUtility {

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
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				SeleniumUtility.getBy(locatorStrategy, locator)));

		// return a reference to the element you just found
		return driver
				.findElement(SeleniumUtility.getBy(locatorStrategy, locator));
	}
}
