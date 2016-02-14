package com.goeuro.utility;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

/**
 * A utility class that contains all the general functionalities in the system
 * that doesn't map to any other utility.
 */
public class GeneralUtility {

	private final static Logger LOGGER = Logger
			.getLogger(GeneralUtility.class.getName());

	public static void navigateToURL(WebDriver driver, String url) {
		LOGGER.log(Level.INFO,
				String.format("Navigating to the URL: \"%s\"", url));
		driver.navigate().to(url);
	}
}
