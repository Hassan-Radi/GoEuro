package com.goeuro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.goeuro.locators.Locators;

/**
 * A page object that contains all the UI objects in the page.
 */
public class Homepage {

	@FindBy(how = How.ID, using = Locators.Homepage.SEARCH_FROM_TEXT_FIELD)
	private WebElement searchFromTextField;

	@FindBy(how = How.ID, using = Locators.Homepage.SEARCH_TO_TEXT_FIELD)
	private WebElement searchToTextfield;

	@FindBy(how = How.ID, using = Locators.Homepage.SEARCH_BUTTON)
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
