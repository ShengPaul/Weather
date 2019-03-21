package com.xt.weather;

import java.util.List;

public class WeatherTest {
    public static void main(String[] args){
        WeatherWSSoap weatherWSSoap = new WeatherWS().getWeatherWSSoap();
        ArrayOfString weather = weatherWSSoap.getWeather("咸宁", null);
        List<String> string = weather.getString();
        for(String str:string){
            System.out.println(str);
        }
    }
}
