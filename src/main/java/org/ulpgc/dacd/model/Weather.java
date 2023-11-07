package org.ulpgc.dacd.model;

import java.time.Instant;

public class Weather {
    private Instant ts;
    private Location location;
    private double rain;
    private double windSpeed;
    private double temp;
    private double humidity;
    private int clouds;

    public Weather(Instant ts, Location location, double rain, double windSpeed, double temp, double humidity, int clouds) {
        if (ts == null) {
            this.ts = Instant.now();
        } else {
            this.ts = ts;
        }
        this.location = location;
        this.rain = rain;
        this.windSpeed = windSpeed;
        this.temp = temp;
        this.humidity = humidity;
        this.clouds = clouds;
    }

    public Instant getTs() {
        return ts;
    }

    public void setTs(Instant ts) {
        this.ts = ts;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public double getWind() {
        return windSpeed;
    }

    public void setWind(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }
}
