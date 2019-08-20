package observer.weather.display;

import observer.weather.data.WeatherData;
import observer.weather.util.Observer;
import observer.weather.util.Subject;

public class HeatIndexDisplay implements Display, Observer {
    private Subject subject;
    private float temperature;
    private float humidity;
    private float heatIndex;

    public HeatIndexDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Head index is " + heatIndex);
    }

    @Override
    public void update(Subject sub, Object ob) {
        if (sub instanceof WeatherData) {
            WeatherData data = (WeatherData) sub;
            this.temperature = data.getTemperature();
            this.humidity = data.getHumidity();
            heatIndex = computeHeatIndex(temperature, humidity);
            display();
        }
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

}
