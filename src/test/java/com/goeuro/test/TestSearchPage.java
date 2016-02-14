package com.goeuro.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.annotations.Test;

import com.goeuro.testdata.TestData;
import com.goeuro.utility.GeneralUtility;
import com.goeuro.utility.SearchUtility;

/**
 * Contains all the tests in the search page.
 */
public class TestSearchPage extends SeleniumBase {

	private final static Logger LOGGER = Logger
			.getLogger(TestSearchPage.class.getName());

	@Test
	public void testSortByPrice() {
		try {
			// navigate to the URL
			GeneralUtility.navigateToURL(driver, TestData.General.URL);

			// perform the search operation and wait for the results page to
			// appear
			SearchUtility.performSearch(driver, TestData.SearchPage.SEARCH_FROM,
					TestData.SearchPage.SEARCH_TO);
		} catch (Exception ex) {
			LOGGER.log(Level.INFO, "An exception was thrown.", ex);
		}
	}
}