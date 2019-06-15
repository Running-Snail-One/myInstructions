package com.observermodel_2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/15 16:49
 * @modified By：
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "%humidity");
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.humidity = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
            display();
        }
    }
}
