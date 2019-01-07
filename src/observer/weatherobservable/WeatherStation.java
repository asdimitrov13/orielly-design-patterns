package observer.weatherobservable;

import observer.weatherobservable.data.WeatherData;
import observer.weatherobservable.display.CurrentConditionsDisplay;
import observer.weatherobservable.display.ForecastDisplay;
import observer.weatherobservable.display.HeatIndexDisplay;
import observer.weatherobservable.display.StatisticsDisplay;

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
