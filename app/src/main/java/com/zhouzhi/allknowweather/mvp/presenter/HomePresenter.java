package com.zhouzhi.allknowweather.mvp.presenter;

import android.util.Log;

import com.zhouzhi.allknowweather.base.BasePresenterImpl;
import com.zhouzhi.allknowweather.base.UrlConstants;
import com.zhouzhi.allknowweather.bean.AirBean;
import com.zhouzhi.allknowweather.bean.BaseWeatherResponse;
import com.zhouzhi.allknowweather.bean.HeWeather6Bean;
import com.zhouzhi.allknowweather.bean.WeatherBean;
import com.zhouzhi.allknowweather.mvp.contract.HomeContract;
import com.zhouzhi.allknowweather.mvp.model.HomeModel;
import com.zhouzhi.allknowweather.net.Api;
import com.zhouzhi.allknowweather.net.RetrofitManager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class HomePresenter extends BasePresenterImpl<HomeContract.View> implements HomeContract.Presenter {

    private static final String TAG = "HomePresenter";
    HomeContract.View mView;

    public HomePresenter(HomeContract.View view) {
        super(view);
        this.mView = view;
    }

    @Override
    public void getWeatherData(String district) {

        Log.d(TAG, "getWeatherData: nnnnnnnnnnnnnnnnnnnnnnnnnn"+"走了请求网络");
        Api api = RetrofitManager.getApi();



            //String cityName = URLEncoder.encode(district,"UTF-8");
        //String key = "8c1c2b0cae5b422a8938a75c669976cc";

            api.getHeWeather(UrlConstants.HE_KEY,district).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<BaseWeatherResponse<HeWeather6Bean>>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(BaseWeatherResponse<HeWeather6Bean> heWeather6BeanBaseWeatherResponse) {


                            mView.showWeatherView(heWeather6BeanBaseWeatherResponse);
                        }


                        @Override
                        public void onError(Throwable e) {

                        }

                        @Override
                        public void onComplete() {

                        }
                    });




    }

    @Override
    public void getAirData(String district) {
        Api api = RetrofitManager.getApi();
        api.getAir(UrlConstants.HE_KEY,district).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseWeatherResponse<AirBean>>() {
                    @Override
                    public void onSubscribe(Disposable d) {


                    }

                    @Override
                    public void onNext(BaseWeatherResponse<AirBean> airBeanBaseWeatherResponse) {
                        mView.showAirView(airBeanBaseWeatherResponse);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
