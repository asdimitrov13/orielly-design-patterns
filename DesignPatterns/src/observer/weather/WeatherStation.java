package observer.weather;

import javafx.beans.Observable;
import observer.weather.display.CurrentConditionsDisplay;
import observer.weather.data.WeatherData;
import observer.weather.display.ForecastDisplay;
import observer.weather.display.HeatIndexDisplay;
import observer.weather.display.StatisticsDisplay;

import java.util.Observer;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(30, 55, 30.4f);
        weatherData.setMeasurements(28, 45, 29.6f);
        weatherData.setMeasurements(33, 58, 33.2f);
    }
}
