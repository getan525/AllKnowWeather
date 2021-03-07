package com.zhouzhi.allknowweather.bean;

import java.util.List;

public class BaseWeatherResponse<T> {
    private List<T> HeWeather6;

    public List<T> getHeWeather6() {
        return HeWeather6;
    }

    public void setHeWeather6(List<T> heWeather6) {
        HeWeather6 = heWeather6;
    }
}
