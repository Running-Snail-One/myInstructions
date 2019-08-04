package com.com.observermodel_2;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/15 17:01
 * @modified By：
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
