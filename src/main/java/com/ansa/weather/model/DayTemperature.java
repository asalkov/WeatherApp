package com.ansa.weather.model;

public class DayTemperature {
    private double morning;
    private double day;
    private double evening;
    private double night;

    private double max;
    private double min;

    public double getMorning() {
        return morning;
    }

    public void setMorning(double morning) {
        this.morning = morning;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public double getEvening() {
        return evening;
    }

    public void setEvening(double evening) {
        this.evening = evening;
    }

    public double getNight() {
        return night;
    }

    public void setNight(double night) {
        this.night = night;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "DayTemperature{" +
                "morning=" + morning +
                ", day=" + day +
                ", evening=" + evening +
                ", night=" + night +
                ", max=" + max +
                ", min=" + min +
                '}';
    }
}
