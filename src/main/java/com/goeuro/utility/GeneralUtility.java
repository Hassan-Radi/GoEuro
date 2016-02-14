package com.goeuro.utility;

import org.openqa.selenium.WebDriver;

/**
 * A utility class that contains all the general functionalities in the system
 * that doesn't map to any other utility.
 */
public class GeneralUtility {

	public static void navigateToURL(WebDriver driver, String url) {
		driver.navigate().to(url);
	}
}
