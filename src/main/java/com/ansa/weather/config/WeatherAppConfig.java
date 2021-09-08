package com.ansa.weather.config;

import com.ansa.weather.service.api.WeatherService;
import com.ansa.weather.service.impl.WeatherServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherAppConfig {
    @Bean
    public WeatherService weatherService(){
        return new WeatherServiceImpl();
    }
}
