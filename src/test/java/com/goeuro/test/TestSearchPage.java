package com.goeuro.test;

import org.testng.annotations.Test;

import com.goeuro.testdata.TestData;
import com.goeuro.utility.GeneralUtility;
import com.goeuro.utility.SearchUtility;

/**
 * Contains all the tests in the search page.
 */
public class TestSearchPage extends SeleniumBase {

	@Test
	public void testSortByPrice() {
		try {
			// navigate to the URL
			GeneralUtility.navigateToURL(driver, TestData.General.URL);

			// perform the search operation and wait for the results page to
			// appear
			SearchUtility.performSearch(TestData.SearchPage.SEARCH_FROM,
					TestData.SearchPage.SEARCH_TO);
		} catch (Exception ex) {
			System.out.print("An exception was thrown." + ex.getStackTrace());
		}
	}
}