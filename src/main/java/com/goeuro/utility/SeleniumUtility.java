package com.goeuro.utility;

import org.openqa.selenium.By;

/**
 * A utility class to handle all the Selenium functionalities.
 */
public class SeleniumUtility {

	public static final String CLASS_NAME = "class name";
	public static final String CSS = "css";
	public static final String ID = "id";
	public static final String LINK_TEXT = "link text";
	public static final String NAME = "name";
	public static final String PARTIAL_LINK_TEXT = "partial link text";
	public static final String TAG_NAME = "tag name";
	public static final String XPATH = "xpath";

	/**
	 * Converts a locator strategy and locator to a Selenium By object.
	 * 
	 * @param locatorStrategy
	 * @param locator
	 * @return
	 */
	public static By getBy(String locatorStrategy, String locator) {
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
