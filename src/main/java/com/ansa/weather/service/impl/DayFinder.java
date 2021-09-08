package com.ansa.weather.service.impl;

import com.ansa.weather.model.DayWeather;

import java.util.ArrayList;
import java.util.List;

public class DayFinder {
    public DayWeather process(List<DayWeather> dailyWeatherValues){

        double maxTemp = getDailyTemperature(dailyWeatherValues.get(0));

        List<DayWeather> maxTempDays = new ArrayList<>();

        for (DayWeather dailyData : dailyWeatherValues){
            double temp = getDailyTemperature(dailyData);
            if (maxTemp == temp){
                maxTempDays.add(dailyData);
            } else {
                if (maxTemp < temp){
                    maxTempDays.clear();
                    maxTemp = temp;
                    maxTempDays.add(dailyData);
                }
            }
        }

        if (maxTempDays.size() == 1){
            return maxTempDays.get(0);
        }

        double maxHumidity = maxTempDays.get(0).getHumidity();
        List<DayWeather> maxHumidityDays = new ArrayList<>();

        for (DayWeather dailyData : maxTempDays){
            double humidity = dailyData.getHumidity();
            if (humidity == maxHumidity){
                maxHumidityDays.add(dailyData);
            } else {
                if (maxHumidity < humidity){
                    maxHumidityDays.clear();
                    maxHumidity = humidity;
                    maxHumidityDays.add(dailyData);
                }
            }
        }

        return maxHumidityDays.get(0);
    }

    private double getDailyTemperature(DayWeather weather){
        return weather.getDayTemperature().getMax();
    }
}
