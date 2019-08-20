package observer.weather.display;

import observer.weather.data.WeatherData;
import observer.weather.util.Observer;
import observer.weather.util.Subject;


public class StatisticsDisplay implements Observer, Display {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private Subject subject;

	public StatisticsDisplay(WeatherData subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	public void update(Subject sub, Object ob) {
		if (sub instanceof WeatherData) {
			WeatherData data = (WeatherData) sub;
			float temp = data.getTemperature();

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

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
	}
}
