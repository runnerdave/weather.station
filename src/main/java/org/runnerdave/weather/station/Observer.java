package org.runnerdave.weather.station;

public interface Observer {
	public void update(float temperature, float humidity, float pressure);
}
