package observer.weather.display;

import observer.weather.data.WeatherData;
import observer.weather.util.Observer;
import observer.weather.util.Subject;


public class ForecastDisplay implements Observer, Display {
	private float currentPressure = 29.92f;
	private float lastPressure;
	private Subject subject;

	public ForecastDisplay(WeatherData subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	public void update(Subject sub, Object ob) {
		if (sub instanceof WeatherData) {
			WeatherData data = (WeatherData) sub;
			lastPressure = currentPressure;
			currentPressure = data.getPressure();
		}


		display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
