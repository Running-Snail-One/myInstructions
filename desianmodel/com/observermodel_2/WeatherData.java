package com.observermodel_2;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/15 16:28
 * @modified By：
 */
public class WeatherData extends Observable {

    private ArrayList observers = null;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }



    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity =humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }

}
