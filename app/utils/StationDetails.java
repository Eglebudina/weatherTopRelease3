package utils;

import play.db.jpa.Model;

import java.util.List;

import models.Reading;

public class StationDetails extends Model {
    public double celcius;
    public double fahrenheit;
    public int windBeaufort;
    public int pressure;
    public String weatherCodes;
    public double windChill;
    public String windDirection;
}