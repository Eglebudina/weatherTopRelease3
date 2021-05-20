package utils;

import models.Reading;

import java.util.List;

public class Trends {
    
    public static String tempTrend(List<Reading> readings) {
        if (readings.size() >= 3) {
            if (readings.get(readings.size()-1).temperature > readings.get(readings.size() - 2).temperature
                    && readings.get(readings.size() - 2).temperature > readings.get(readings.size() - 3).temperature) {
                return "arrow up";
            } else if (readings.get(readings.size()-1).temperature < readings.get(readings.size() - 2).temperature
                    && readings.get(readings.size() - 2).temperature < readings.get(readings.size() - 3).temperature) {
                return "arrow down";
            } else
                return "alternate horizontal";
        } else
            return "Not Enough Data for trend analysis";
    }

    public static String windTrend(List<Reading> readings) {
        if (readings.size() >= 3) {
            if (readings.get(readings.size()-1).windSpeed > readings.get(readings.size() - 2).windSpeed
                    && readings.get(readings.size() - 2).windSpeed > readings.get(readings.size() - 3).windSpeed) {
                return "UP";
            } else if (readings.get(readings.size()-1).windSpeed < readings.get(readings.size() - 2).windSpeed
                    && readings.get(readings.size() - 2).windSpeed < readings.get(readings.size() - 3).windSpeed) {
                return "DOWN";
            } else
                return "STEADY";
        } else
            return "Not Enough Data for trend analysis";
    }

    public static String presTrend(List<Reading> readings) {
        if (readings.size() >= 3) {
            if (readings.get(readings.size()-1).pressure > readings.get(readings.size() - 2).pressure
                    && readings.get(readings.size() - 2).pressure > readings.get(readings.size() - 3).pressure) {
                return "UP";
            } else if (readings.get(readings.size()-1).pressure< readings.get(readings.size() - 2).pressure
                    && readings.get(readings.size() - 2).pressure < readings.get(readings.size() - 3).pressure) {
                return "DOWN";
            } else
                return "STEADY";
        } else
            return "Not Enough Data for trend analysis";
    }

}