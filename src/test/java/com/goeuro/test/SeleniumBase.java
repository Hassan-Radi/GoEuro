package com.goeuro.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.goeuro.testdata.TestData;

/**
 * Base Selenium test class to provide all the basic functions for any Selenium
 * test.
 */
public class SeleniumBase {

	protected WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();

		// set driver waits
		driver.manage().timeouts().implicitlyWait(
				TestData.General.FINDING_ELEMENT_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(
				TestData.General.PAGE_LOADING_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(
				TestData.General.SCRIPT_TIMEOUT, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		if (driver != null) {
			driver.quit();
		}
	}
}
