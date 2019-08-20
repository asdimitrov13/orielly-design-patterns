package observer.weather.display;

import observer.weather.data.WeatherData;
import observer.weather.util.Subject;
import observer.weather.util.Observer;

public class CurrentConditionsDisplay implements Display, Observer {

    private float temperature;
    private float humidity;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + " % humidity");
    }

    @Override
    public void update(Subject sub, Object ob) {
        if (sub instanceof WeatherData) {
            WeatherData data = (WeatherData) sub;
            this.temperature = data.getTemperature();
            this.humidity = data.getHumidity();
            display();
        }
    }
}
