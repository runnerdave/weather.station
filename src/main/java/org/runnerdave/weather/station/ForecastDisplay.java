package org.runnerdave.weather.station;

public class ForecastDisplay implements DisplayWeatherInfo, Observer {

	Subject weatherData;
	private float temperature;
	private float humidity;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.subscribe(this);
	}

	
	public void displayInfo() {
		System.out.println("The Forecast for today is: " + temperature + " celsius with a humidity of "
				+ humidity + " %");

	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		displayInfo();
		
	}

}
