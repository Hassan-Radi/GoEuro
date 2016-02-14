package com.goeuro.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.goeuro.locators.Locators;
import com.goeuro.pieces.TestResultPiece;

/**
 * A page object that contains all the UI objects in the page.
 */
public class SearchResultsPage extends PageObject {

	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = Locators.SearchResults.SEARCH_RESULTS_MAP)
	private WebElement searchResultsMap;

	@FindBy(how = How.XPATH, using = Locators.SearchResults.SEARCH_RESULT_ITEM)
	private List<WebElement> searchResults;

	/**
	 * @return the searchResultsMap
	 */
	public WebElement getSearchResultsMap() {
		return searchResultsMap;
	}

	/**
	 * @return the searchResults
	 */
	public TestResultPiece[] getSearchResults() {
		TestResultPiece[] testResultPieces = new TestResultPiece[searchResults
				.size()];

		for (int i = 0; i < testResultPieces.length; i++) {
			testResultPieces[i] = new TestResultPiece(driver, i + 1);
		}

		return testResultPieces;
	}
}
