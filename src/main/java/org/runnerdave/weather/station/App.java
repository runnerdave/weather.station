package org.runnerdave.weather.station;

/**
 * App to test the observer pattern.
 *
 */
public class App {
	public static void main(String[] args) {
		WeatherData wd = new WeatherData(25, 88, 69);

		ForecastDisplay fd = new ForecastDisplay(wd);
		System.out.println("initial values for fd");
		fd.displayInfo();
		CurrentConditionsDisplay cd = new CurrentConditionsDisplay(wd);
		System.out.println("initial values for cd");
		cd.displayInfo();

		System.out.println();
		
		wd.updateValues(15, 25.0f, 96.3f);
		wd.updateValues(-13, 21.0f, 92.3f);

	}
}
