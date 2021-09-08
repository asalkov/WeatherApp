package com.ansa.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayWeather {
    @JsonProperty("temp")
    private DayTemperature dayTemperature;
    private double humidity;

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public DayTemperature getDayTemperature() {
        return dayTemperature;
    }

    public void setDayTemperature(DayTemperature dayTemperature) {
        this.dayTemperature = dayTemperature;
    }

    @Override
    public String toString() {
        return "DayWeather{" +
                "dayTemperature=" + dayTemperature +
                ", humidity=" + humidity +
                '}';
    }
}
