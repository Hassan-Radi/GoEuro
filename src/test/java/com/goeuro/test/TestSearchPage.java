package com.goeuro.test;

import java.awt.Desktop;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.goeuro.testdata.TestData;
import com.goeuro.testdata.TestResultObject;
import com.goeuro.utility.GeneralUtility;
import com.goeuro.utility.SearchUtility;

/**
 * Contains all the tests in the search page.
 */
public class TestSearchPage extends SeleniumBase {

	private final static Logger LOGGER = Logger
			.getLogger(TestSearchPage.class.getName());

	public static final String REPORT_PATH = "test-output/index.html";

	@Test
	public void testSortByPrice() {
		try {
			// navigate to the URL
			GeneralUtility.navigateToURL(driver, TestData.General.URL);

			// perform the search operation and wait for the results page to
			// appear
			TestResultObject[] results = SearchUtility.performSearch(driver,
					TestData.SearchPage.SEARCH_FROM,
					TestData.SearchPage.SEARCH_TO);

			TestResultObject[] actualResults = results.clone();
			Arrays.sort(results, new Comparator<TestResultObject>() {
				public int compare(TestResultObject o1, TestResultObject o2) {
					return Float.compare(o1.getTotalPrice(),
							o2.getTotalPrice());
				}
			});

			LOGGER.log(Level.INFO,
					"Comparing actual results with the expected results...");
			Assert.assertEquals(actualResults, results,
					"Comparing expected result with the actual results.");

			// open the report after you finish execution
			Desktop.getDesktop().open(new File(REPORT_PATH));
		} catch (Exception ex) {
			LOGGER.log(Level.INFO, "An exception was thrown.", ex);
		}
	}
}