package com.ansa.weather.service.impl;

import com.ansa.weather.model.DayTemperature;
import com.ansa.weather.model.DayWeather;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayFinderTest {

    private DayFinder dayFinder = new DayFinder();

    @Test
    public void singleMax(){
        List<DayWeather> data = new ArrayList<>();
        data.add(createDailyData(30, 98));
        data.add(createDailyData(29, 98));
        data.add(createDailyData(31, 97));

        DayWeather day = dayFinder.process(data);

        assertEquals(31, day.getDayTemperature().getMax());
    }

    @Test
    public void multipleMax(){
        List<DayWeather> data = new ArrayList<>();
        data.add(createDailyData(30, 60));
        data.add(createDailyData(30, 50));
        data.add(createDailyData(30, 80));
        data.add(createDailyData(30, 40));
        data.add(createDailyData(30, 80));

        DayWeather day = dayFinder.process(data);

        assertEquals(30, day.getDayTemperature().getMax());
        assertEquals(80, day.getHumidity());

    }

    private DayWeather createDailyData(double maxTemp, double humidity){
        DayWeather dailyWeather = new DayWeather();
        dailyWeather.setHumidity(humidity);

        DayTemperature temperature = new DayTemperature();
        temperature.setMax(maxTemp);
        dailyWeather.setDayTemperature(temperature);
        return dailyWeather;
    }
}
