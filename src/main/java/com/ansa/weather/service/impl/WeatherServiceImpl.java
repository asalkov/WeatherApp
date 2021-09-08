package com.ansa.weather.service.impl;

import com.ansa.weather.model.DayWeather;
import com.ansa.weather.model.Location;
import com.ansa.weather.model.WeatherInformation;
import com.ansa.weather.service.api.WeatherService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class WeatherServiceImpl implements WeatherService {

    @Value("${weather.service.appKey}")
    private String appKey;

    private final static String WEATHER_SERVICE_METHOD_URL = "https://api.openweathermap.org/data/2.5/onecall?lat={lat}&lon={lon}&exclude={part}&appid={API key}";
    private final RestTemplate restTemplate = new RestTemplate();
    private final DayFinder dayFinder = new DayFinder();

    @Override
    public DayWeather getMaxTemperatureDay(Location location) {
        WeatherInformation response = restTemplate.getForObject(
                WEATHER_SERVICE_METHOD_URL,
                WeatherInformation.class,
                location.getLatitude(),
                location.getLatitude(),
                null,
                appKey);

        if (response == null){
            throw new RuntimeException("No data from weather service");
        } else {
            return dayFinder.process(response.getDaily());
        }
    }
}
