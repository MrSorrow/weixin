package com.ping.model.weather;

import java.util.Date;

public class Realtime
{
    private Wind wind;

    private String time;

    private Weather weather;

    private String dataUptime;

    private String date;

    private String city_code;

    private String city_name;

    private String week;

    private String moon;

    public void setWind(Wind wind){
        this.wind = wind;
    }
    public Wind getWind(){
        return this.wind;
    }
    public void setTime(String time){
        this.time = time;
    }
    public String getTime(){
        return this.time;
    }
    public void setWeather(Weather weather){
        this.weather = weather;
    }
    public Weather getWeather(){
        return this.weather;
    }
    public void setDataUptime(String dataUptime){
        this.dataUptime = dataUptime;
    }
    public String getDataUptime(){
        return this.dataUptime;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return this.date;
    }
    public void setCity_code(String city_code){
        this.city_code = city_code;
    }
    public String getCity_code(){
        return this.city_code;
    }
    public void setCity_name(String city_name){
        this.city_name = city_name;
    }
    public String getCity_name(){
        return this.city_name;
    }
    public void setWeek(String week){
        this.week = week;
    }
    public String getWeek(){
        return this.week;
    }
    public void setMoon(String moon){
        this.moon = moon;
    }
    public String getMoon(){
        return this.moon;
    }
}