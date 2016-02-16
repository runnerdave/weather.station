package org.runnerdave.weather.station;

public class CurrentConditionsDisplay implements DisplayWeatherInfo, Observer {

	Subject weatherData;
	private float temperature;
	private float pressure;
	private float humidity;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.subscribe(this);
	}

	public void displayInfo() {
		System.out.println("Current Condtions: Temp.: " + temperature + " , Humidity: " + humidity
				+ " , Pressure: " + pressure);

	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		displayInfo();

	}

}
