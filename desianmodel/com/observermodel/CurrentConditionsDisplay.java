package com.observermodel;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/15 16:49
 * @modified By：
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "%humidity");
    }

    @Override
    public void update(float temperature, float humidity, float presure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
