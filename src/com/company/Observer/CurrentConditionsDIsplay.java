package com.company.Observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDIsplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentConditionsDIsplay(Observable weatherData) {
        this.observable = weatherData;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display(){
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}