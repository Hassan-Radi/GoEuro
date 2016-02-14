package com.goeuro.testdata;

/**
 * A class that represents a test result object.
 */
public class TestResultObject {

	private float totalPrice;
	private String trainOperator;
	private String departureTime;
	private String departureStation;
	private String arrivalTime;
	private String arrivalStation;
	private String tripStops;
	private String totalLegTime;

	public TestResultObject(float totalPrice, String trainOperator,
			String departureTime, String departureStation, String arrivalTime,
			String arrivalStation, String tripStops, String totalLegTime) {
		super();
		this.totalPrice = totalPrice;
		this.trainOperator = trainOperator;
		this.departureTime = departureTime;
		this.departureStation = departureStation;
		this.arrivalTime = arrivalTime;
		this.arrivalStation = arrivalStation;
		this.tripStops = tripStops;
		this.totalLegTime = totalLegTime;
	}

	/**
	 * @return the totalPrice
	 */
	public float getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @return the trainOperator
	 */
	public String getTrainOperator() {
		return trainOperator;
	}

	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}

	/**
	 * @return the departureStation
	 */
	public String getDepartureStation() {
		return departureStation;
	}

	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * @return the arrivalStation
	 */
	public String getArrivalStation() {
		return arrivalStation;
	}

	/**
	 * @return the tripStops
	 */
	public String getTripStops() {
		return tripStops;
	}

	/**
	 * @return the totalLegTime
	 */
	public String getTotalLegTime() {
		return totalLegTime;
	}

	@Override
	public String toString() {
		return "\nTest Result [totalPrice=" + totalPrice + ", trainOperator="
				+ trainOperator + ", departureTime=" + departureTime
				+ ", departureStation=" + departureStation + ", arrivalTime="
				+ arrivalTime + ", arrivalStation=" + arrivalStation
				+ ", tripStops=" + tripStops + ", totalLegTime=" + totalLegTime
				+ "]\n";
	}
}
