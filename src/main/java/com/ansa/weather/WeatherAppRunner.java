package com.ansa.weather;

import com.ansa.weather.model.DayWeather;
import com.ansa.weather.model.Location;
import com.ansa.weather.service.api.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherAppRunner implements CommandLineRunner {

    @Autowired
    private WeatherService weatherService;

    public static void main(String[] args) {
        SpringApplication.run(WeatherAppRunner.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        DayWeather dailyWeather = weatherService.getMaxTemperatureDay(
                new Location(50.824955973889, -0.13878781625840952)
        );

        System.out.println(dailyWeather);

    }
}
