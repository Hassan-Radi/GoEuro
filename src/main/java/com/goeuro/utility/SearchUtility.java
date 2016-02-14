package com.goeuro.utility;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.goeuro.locators.Locators;
import com.goeuro.pages.HomepagePage;
import com.goeuro.pages.SearchResultsPage;
import com.goeuro.pieces.TestResultPiece;
import com.goeuro.testdata.TestResultObject;

/**
 * A utility class that contains all the modules related to the search page.
 */
public class SearchUtility {

	private final static Logger LOGGER = Logger
			.getLogger(SearchUtility.class.getName());

	public static TestResultObject[] performSearch(WebDriver driver,
			String searchFrom, String searchTo) {
		LOGGER.log(Level.INFO,
				String.format(
						"Performing search with values: \"%s\" and \"%s\"",
						searchFrom, searchTo));

		// initiate the Homepage object that you are going to use for the search
		// operation.
		HomepagePage homepage = PageFactory.initElements(driver,
				HomepagePage.class);

		// do the search operation
		// type in each field and select the field with the exact text from the
		// auto-complete menu
		LOGGER.log(Level.INFO, String.format(
				"Typing \"%s\" in the search from text field...", searchFrom));
		homepage.getSearchFromTextField().sendKeys(searchFrom);
		WaitUtility.waitForElementToBeVisibleBy(driver, SeleniumUtility.XPATH,
				String.format(Locators.Homepage.AUTO_COMPLETE_MENU_ITEM,
						searchFrom),
				10).click();

		LOGGER.log(Level.INFO, String.format(
				"Typing \"%s\" in the search to text field...", searchTo));
		homepage.getSearchToTextfield().sendKeys(searchTo);
		WaitUtility.waitForElementToBeVisibleBy(driver, SeleniumUtility.XPATH,
				String.format(Locators.Homepage.AUTO_COMPLETE_MENU_ITEM,
						searchTo),
				10).click();

		LOGGER.log(Level.INFO, "Clicking on the search button...");
		homepage.getSearchButton().click();

		LOGGER.log(Level.INFO,
				"Waiting for the search operation to complete...");

		// initiate the SearchResults object that you are going to interact
		// with.
		SearchResultsPage searchResultsPage = PageFactory.initElements(driver,
				SearchResultsPage.class);

		TestResultPiece[] testResultUIPieces = searchResultsPage
				.getSearchResults();
		int searchResultsCount = testResultUIPieces.length;

		LOGGER.log(Level.INFO, String.format(
				"Search operation returned %s results.", searchResultsCount));

		// get the search results
		TestResultObject[] results = new TestResultObject[searchResultsCount];
		for (int i = 0; i < results.length; i++) {
			results[i] = testResultUIPieces[i].getTestResultObject();
			LOGGER.log(Level.INFO, results[i].toString());
		}

		return results;
	}
}
