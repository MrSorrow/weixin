package com.ping.model.weather;

public class Weather
{
    private String humidity;

    private String img;

    private String info;

    private String temperature;

    public void setHumidity(String humidity){
        this.humidity = humidity;
    }
    public String getHumidity(){
        return this.humidity;
    }
    public void setImg(String img){
        this.img = img;
    }
    public String getImg(){
        return this.img;
    }
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return this.info;
    }
    public void setTemperature(String temperature){
        this.temperature = temperature;
    }
    public String getTemperature(){
        return this.temperature;
    }
}