package com.goeuro.testdata;

/**
 * All the test data to be used by the test automation.
 */
public class TestData {

	/**
	 * All the general test data (not related to any specific page.
	 */
	public class General {
		public static final String URL = "http://www.goeuro.com/";
		public static final int PAGE_LOADING_TIMEOUT = 60;
		public static final int FINDING_ELEMENT_TIMEOUT = 20;
		public static final int SCRIPT_TIMEOUT = 10;
	}

	/**
	 * All the test data related to the search page.
	 */
	public class SearchPage {
		public static final String SEARCH_FROM = "Berlin, Germany";
		public static final String SEARCH_TO = "Prague, Czech Republic";
	}
}
