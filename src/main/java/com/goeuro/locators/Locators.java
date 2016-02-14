package com.goeuro.locators;

/**
 * A class that acts as a holder to all the locators in the website.
 */
public class Locators {

	/**
	 * All the locators in the homepage
	 */
	public class Homepage {
		public static final String SEARCH_FROM_TEXT_FIELD = "from_filter";
		public static final String SEARCH_TO_TEXT_FIELD = "to_filter";
		public static final String SEARCH_BUTTON = "search-form__submit-btn";
		public static final String AUTO_COMPLETE_MENU_ITEM = "//li[@class='ui-menu-item']/a[text()=\"%s\"]";
	}

	/**
	 * All the locators in the search results page.
	 */
	public class SearchResults {
		public static final String SEARCH_RESULTS_MAP = "mymap";
	}
}
