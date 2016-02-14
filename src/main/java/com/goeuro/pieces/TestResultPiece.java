package com.goeuro.pieces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.goeuro.locators.Locators;
import com.goeuro.testdata.TestResultObject;
import com.goeuro.utility.SeleniumUtility;

/**
 * A UI Page Piece that represents each test result on the search results page.
 */
public class TestResultPiece {

	private final WebDriver driver;
	// An index for each of the test result items on the page
	private final int index;
	private WebElement price;
	private WebElement priceDecimals;
	private WebElement trainOperator;
	private WebElement departureTime;
	private WebElement departureStation;
	private WebElement arrivalTime;
	private WebElement arrivalStation;
	private WebElement tripStops;
	private WebElement totalLegTime;

	public TestResultPiece(WebDriver driver, int index) {
		super();
		this.driver = driver;
		this.index = index;

		// initialize all the objects with their values
		getPrice();
		getPriceDecimals();
		getTrainOperator();
		getDepartureTime();
		getDepartureStation();
		getArrivalTime();
		getArrivalStation();
		getTripStops();
		getTotalLegTime();
	}

	public TestResultObject getTestResultObject() {
		float totalPrice = Float
				.valueOf(price.getText() + "." + priceDecimals.getText());
		String trainOperatorText = getTrainOperatorText();
		String departureTimeText = getDepartureTimeText();
		String departureStationText = getDepartureStationText();
		String arrivalTimeText = getArrivalTimeText();
		String arrivalStationText = getArrivalStationText();
		String tripStopsText = getTripStopsText();
		String totalLegTimeText = getTotalLegTimeText();

		return new TestResultObject(totalPrice, trainOperatorText,
				departureTimeText, departureStationText, arrivalTimeText,
				arrivalStationText, tripStopsText, totalLegTimeText);
	}

	/**
	 * @return the price
	 */
	public WebElement getPrice() {
		price = driver.findElement(SeleniumUtility.getBy(SeleniumUtility.XPATH,
				String.format(Locators.SearchResultItem.PRICE, index)));
		return price;
	}

	/**
	 * @return the priceDecimals
	 */
	public WebElement getPriceDecimals() {
		priceDecimals = driver.findElement(
				SeleniumUtility.getBy(SeleniumUtility.XPATH, String.format(
						Locators.SearchResultItem.PRICE_DECIMALS, index)));
		return priceDecimals;
	}

	/**
	 * @return the trainOperator
	 */
	public WebElement getTrainOperator() {
		trainOperator = driver.findElement(
				SeleniumUtility.getBy(SeleniumUtility.XPATH, String.format(
						Locators.SearchResultItem.TRAIN_OPERATOR, index)));
		return trainOperator;
	}

	/**
	 * @return the departureTime
	 */
	public WebElement getDepartureTime() {
		departureTime = driver.findElement(
				SeleniumUtility.getBy(SeleniumUtility.XPATH, String.format(
						Locators.SearchResultItem.DEPARTURE_TIME, index)));
		return departureTime;
	}

	/**
	 * @return the departureStation
	 */
	public WebElement getDepartureStation() {
		departureStation = driver
				.findElement(SeleniumUtility.getBy(SeleniumUtility.XPATH,
						String.format(
								Locators.SearchResultItem.DEPARTURE_STATION,
								index)));
		return departureStation;
	}

	/**
	 * @return the arrivalTime
	 */
	public WebElement getArrivalTime() {
		arrivalTime = driver.findElement(SeleniumUtility.getBy(
				SeleniumUtility.XPATH,
				String.format(Locators.SearchResultItem.ARRIVAL_TIME, index)));
		return arrivalTime;
	}

	/**
	 * @return the arrivalStation
	 */
	public WebElement getArrivalStation() {
		arrivalStation = driver.findElement(
				SeleniumUtility.getBy(SeleniumUtility.XPATH, String.format(
						Locators.SearchResultItem.ARRIVAL_STATION, index)));
		return arrivalStation;
	}

	/**
	 * @return the tripStops
	 */
	public WebElement getTripStops() {
		tripStops = driver.findElement(SeleniumUtility.getBy(
				SeleniumUtility.XPATH,
				String.format(Locators.SearchResultItem.TRIP_STOPS, index)));
		return tripStops;
	}

	/**
	 * @return the totalLegTime
	 */
	public WebElement getTotalLegTime() {
		totalLegTime = driver.findElement(
				SeleniumUtility.getBy(SeleniumUtility.XPATH, String.format(
						Locators.SearchResultItem.TOTAL_LEG_TIME, index)));
		return totalLegTime;
	}

	public String getTrainOperatorText() {
		return trainOperator.getAttribute("alt");
	}

	public String getDepartureTimeText() {
		return departureTime.getText().trim().split(" ")[0];
	}

	public String getDepartureStationText() {
		return departureStation.getAttribute("title");
	}

	public String getArrivalTimeText() {
		return arrivalTime.getText().trim().split(" ")[0];
	}

	public String getArrivalStationText() {
		return arrivalStation.getAttribute("title");
	}

	public String getTripStopsText() {
		return tripStops.getText().trim();
	}

	public String getTotalLegTimeText() {
		return totalLegTime.getText();
	}
}
