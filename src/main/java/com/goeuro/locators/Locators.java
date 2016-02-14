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
		public static final String SEARCH_RESULT_ITEM = "//div[@id='results-train']//div[@class='result']";
	}

	public class SearchResultItem {
		public static final String PRICE = "//div[@id='results-train']//div[@class='result'][%s]//td[@class='price-cell']//span[@class='currency-beforecomma']";
		public static final String PRICE_DECIMALS = "//div[@id='results-train']//div[@class='result'][%s]//td[@class='price-cell']//span[@class='currency-decimals'][2]";
		public static final String TRAIN_OPERATOR = "//div[@id='results-train']//div[@class='result'][%s]//ul[1]/li/img";
		public static final String DEPARTURE_TIME = "//div[@id='results-train']//div[@class='result'][%s]//table//table[2]//tr[2]/td[1]";
		public static final String DEPARTURE_STATION = "//div[@id='results-train']//div[@class='result'][%s]//table//table[1]//tr[3]/td[1]/span";
		public static final String ARRIVAL_TIME = "//div[@id='results-train']//div[@class='result'][%s]//table//table[2]//tr[2]/td[@class='departure-datetime']";
		public static final String ARRIVAL_STATION = "//div[@id='results-train']//div[@class='result'][%s]//table//table[1]//tr[3]/td[2]/span";
		public static final String TRIP_STOPS = "//div[@id='results-train']//div[@class='result'][%s]//table//table[2]//td[@class='stops']/span";
		public static final String TOTAL_LEG_TIME = "//div[@id='results-train']//div[@class='result'][%s]//table//table[2]//td[@class='total-leg-time']/span";
	}
}
