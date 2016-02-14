package com.goeuro.utility;

import com.goeuro.pages.Homepage;

/**
 * A utiltiy class that contains all the modules related to the search page.
 */
public class SearchUtility {

	public static void performSearch(String searchFrom, String searchTo) {
		Homepage homepage = new Homepage();
		homepage.getSearchFromTextField().sendKeys(searchFrom);
		homepage.getSearchToTextfield().sendKeys(searchTo);
		homepage.getSearchButton().click();
	}
}
