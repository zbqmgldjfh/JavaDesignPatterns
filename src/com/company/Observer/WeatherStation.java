package com.company.Observer;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDIsplay curDisplay = new CurrentConditionsDIsplay(weatherData);
        //HeatIndexDisplay hitDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 30.4f);
        weatherData.setMeasurements(77, 77, 20.4f);
    }
}
