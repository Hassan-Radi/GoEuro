package com.goeuro.pages;

import org.openqa.selenium.WebDriver;

/**
 * A parent class for all page objects across the system.
 */
public class PageObject {

	protected final WebDriver driver;

	public PageObject(WebDriver driver) {
		super();
		this.driver = driver;
	}
}
