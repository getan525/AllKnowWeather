package com.zhouzhi.allknowweather.mvp.contract;

import com.zhouzhi.allknowweather.bean.AirBean;
import com.zhouzhi.allknowweather.bean.BaseWeatherResponse;
import com.zhouzhi.allknowweather.bean.HeWeather6Bean;

public interface HomeContract {
    interface Model {
    }

    interface View extends BaseContract.BaseView<Presenter>{

        void showWeatherView(BaseWeatherResponse<HeWeather6Bean> dataBean);
        void showAirView(BaseWeatherResponse<AirBean> dataBean);
    }

    interface Presenter extends BaseContract.BasePresenter {
        void getWeatherData(String district);
        void getAirData(String district);
    }
}
