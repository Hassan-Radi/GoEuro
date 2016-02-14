package com.goeuro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.goeuro.locators.Locators;

/**
 * A page object that contains all the UI objects in the page.
 */
public class SearchResults {

	@FindBy(how = How.ID, using = Locators.SearchResults.SEARCH_RESULTS_MAP)
	private WebElement searchResultsMap;

	/**
	 * @return the searchResultsMap
	 */
	public WebElement getSearchResultsMap() {
		return searchResultsMap;
	}
}
