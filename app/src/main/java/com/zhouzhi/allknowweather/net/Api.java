package com.zhouzhi.allknowweather.net;






import com.zhouzhi.allknowweather.bean.AirBean;
import com.zhouzhi.allknowweather.bean.BaseWeatherResponse;
import com.zhouzhi.allknowweather.bean.HeWeather6Bean;
import com.zhouzhi.allknowweather.bean.WeatherBean;
import com.zhouzhi.allknowweather.mvp.model.HomeModel;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {




    @GET("weather_mini")
    Observable<WeatherBean> getWeather(@Query("city") String district);

    /**
     * 和风天气接口
     * @param
     * @return
     */
    @GET("weather")
    Observable<BaseWeatherResponse<HeWeather6Bean>> getHeWeather(@Query("key") String key, @Query("location") String location);

    @GET("air/now")
    Observable<BaseWeatherResponse<AirBean>> getAir(@Query("key") String key, @Query("location") String location);
}
