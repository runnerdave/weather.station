package org.runnerdave.weather.station;

import java.util.ArrayList;

public class WeatherData implements Subject {

	ArrayList<Observer> observers;

	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData(float temperature, float humidity, float pressure) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		observers = new ArrayList<Observer>();
	}
	
	public void updateValues(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}

	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}

	public void subscribe(Observer o) {
		observers.add(o);

	}

	public void unsubscribe(Observer o) {
		observers.remove(o);

	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

}
