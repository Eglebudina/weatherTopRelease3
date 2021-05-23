package utils;

import models.Reading;
import models.Station;

import java.util.List;

public class Trends {
    public static String tempTrend(List<Reading> readings) {
        if (readings.size() >= 3) {
            if (readings.get(readings.size() - 1).temperature > readings.get(readings.size() - 2).temperature
                    && readings.get(readings.size() - 2).temperature > readings.get(readings.size() - 3).temperature) {
                return "arrow up";
            } else if (readings.get(readings.size() - 1).temperature < readings.get(readings.size() - 2).temperature
                    && readings.get(readings.size() - 2).temperature < readings.get(readings.size() - 3).temperature) {
                return "arrow down";
            } else
            return "arrows alternate horizontal";
        } else
            return "minus circle";
    }

    public static String windTrend(List<Reading> readings) {
        if (readings.size() >= 3) {
            if (readings.get(readings.size() - 1).windSpeed > readings.get(readings.size() - 2).windSpeed
                    && readings.get(readings.size() - 2).windSpeed > readings.get(readings.size() - 3).windSpeed) {
                return "arrow up";
            } else if (readings.get(readings.size() - 1).windSpeed < readings.get(readings.size() - 2).windSpeed
                    && readings.get(readings.size() - 2).windSpeed < readings.get(readings.size() - 3).windSpeed) {
                return "arrow down";
            } else
                return "arrows alternate horizontal";
        } else
            return "minus circle";
    }

    public static String presTrend(List<Reading> readings) {
        if (readings.size() >= 3) {
            if (readings.get(readings.size() - 1).pressure > readings.get(readings.size() - 2).pressure
                    && readings.get(readings.size() - 2).pressure > readings.get(readings.size() - 3).pressure) {
                return "arrow up";
            } else if (readings.get(readings.size() - 1).pressure < readings.get(readings.size() - 2).pressure
                    && readings.get(readings.size() - 2).pressure < readings.get(readings.size() - 3).pressure) {
                return "arrow down";
            } else
                return "arrows alternate horizontal";
        } else
            return "minus circle";
    }
}