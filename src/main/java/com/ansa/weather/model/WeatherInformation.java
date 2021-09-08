package com.ansa.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherInformation {
    @JsonProperty("daily")
    private List<DayWeather> daily;

    public List<DayWeather> getDaily() {
        return daily;
    }

    public void setDaily(List<DayWeather> daily) {
        this.daily = daily;
    }
}
