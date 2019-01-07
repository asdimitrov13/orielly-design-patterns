package observer.weatherobservable.display;

import observer.weatherobservable.data.WeatherData;

import java.util.Observable;
import java.util.Observer;


public class StatisticsDisplay implements Observer, Display {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private Observable observable;

	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			float temp = weatherData.getTemperature();

			tempSum += temp;
			numReadings++;

			if (temp > maxTemp) {
				maxTemp = temp;
			}

			if (temp < minTemp) {
				minTemp = temp;
			}

			display();
		}
	}
}
