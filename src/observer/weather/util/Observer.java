package observer.weather.util;

public interface Observer {

    void update(float temperature, float humidity, float pressure);
}
