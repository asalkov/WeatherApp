package com.ansa.weather.service.api;

import com.ansa.weather.model.DayWeather;
import com.ansa.weather.model.Location;

public interface WeatherService {
    DayWeather getMaxTemperatureDay(Location location);
}
