package com.goeuro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * A page object that contains all the UI objects in the page.
 */
public class Homepage {

	@FindBy(id = "from_filter")
	private WebElement searchFromTextField;

	@FindBy(id = "to_filter")
	private WebElement searchToTextfield;

	@FindBy(id = "search-form__submit-btn")
	private WebElement searchButton;

	/**
	 * @return the searchFromTextField
	 */
	public WebElement getSearchFromTextField() {
		return searchFromTextField;
	}

	/**
	 * @return the searchToTextfield
	 */
	public WebElement getSearchToTextfield() {
		return searchToTextfield;
	}

	/**
	 * @return the searchButton
	 */
	public WebElement getSearchButton() {
		return searchButton;
	}
}
