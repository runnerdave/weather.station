package org.runnerdave.weather.station;

public interface Subject {
	public void notifyObservers();
	
	public void subscribe(Observer o);
	
	public void unsubscribe(Observer o);
	
}
