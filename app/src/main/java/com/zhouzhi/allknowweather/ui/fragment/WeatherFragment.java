package com.zhouzhi.allknowweather.ui.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.zhouzhi.allknowweather.MainActivity;
import com.zhouzhi.allknowweather.R;
import com.zhouzhi.allknowweather.base.BaseMvpFragment;
import com.zhouzhi.allknowweather.bean.AirBean;
import com.zhouzhi.allknowweather.bean.BaseWeatherResponse;
import com.zhouzhi.allknowweather.bean.HeWeather6Bean;
import com.zhouzhi.allknowweather.bean.WeatherBean;
import com.zhouzhi.allknowweather.mvp.contract.HomeContract;
import com.zhouzhi.allknowweather.mvp.presenter.HomePresenter;
import com.zhouzhi.allknowweather.ui.adapter.MyAqiAdapter;
import com.zhouzhi.allknowweather.ui.adapter.MyForecastAdapter;

import java.util.List;

import butterknife.BindView;

public class WeatherFragment extends BaseMvpFragment<HomeContract.Presenter> implements HomeContract.View {
    @BindView(R.id.toolbar_weather)
    Toolbar mToolbar;
    @BindView(R.id.tv_location)
    TextView mLocation;
    @BindView(R.id.tv_now_temp)
    TextView mTv_Temp;
    @BindView(R.id.tv_now_type)
    TextView mTv_type;
    @BindView(R.id.tv_today_high)
    TextView mTv_high;
    @BindView(R.id.tv_today_low)
    TextView mTv_low;
    @BindView(R.id.tv_now_hum)
    TextView mTv_hum;
    @BindView(R.id.tv_now_pres)
    TextView mTv_qi;
    @BindView(R.id.tv_now_wind_sc)
    TextView mTv_wind;
    @BindView(R.id.rv_forecast)
    RecyclerView mForecast;
    @BindView(R.id.rv_aqi)
    RecyclerView mRv_aqi;

    public LocationClient mLocationClient;
    private String mDistrict;

    public static WeatherFragment newInstance() {
        WeatherFragment fragment = new WeatherFragment();
        Bundle bundle = new Bundle();
        //bundle.putString("District",s);
        //Log.d("TAG", "newInstance: ssssssssssssss"+s);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected void initRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_weather, container, false);
        mToolbar = mRootView.findViewById(R.id.toolbar_weather);
        mLocation = mRootView.findViewById(R.id.tv_location);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((MainActivity) getActivity()).setToolbar(mToolbar);
    }

    @Override
    protected void initEvent() {
        mLocationClient = new LocationClient(getContext());
        mLocationClient.registerLocationListener(new MyLocationListener());
        initLocationClientOption();

        requestLocation();
    }

    @Override
    protected void initData(boolean isSavedInstanceState) {
        /*Bundle arguments = getArguments();
        String district = null;
        if (arguments!=null){
            district = arguments.getString("District");

        }
        mLocation.setText(district);
        Log.d(TAG, "initData: ,,,,,,,,,,,,,,"+district);*/
        Log.d(TAG, "run: " + mDistrict);

    }




    private void requestLocation() {
        mLocationClient.start();
    }

    private void initLocationClientOption() {
        LocationClientOption option = new LocationClientOption();

        option.setIsNeedAddress(true);
        //可选，是否需要地址信息，默认为不需要，即参数为false
        //如果开发者需要获得当前点的地址信息，此处必须为true

        option.setNeedNewVersionRgc(true);
        //可选，设置是否需要最新版本的地址信息。默认需要，即参数为true

        mLocationClient.setLocOption(option);
        //mLocationClient为第二步初始化过的LocationClient对象
        //需将配置好的LocationClientOption对象，通过setLocOption方法传递给LocationClient对象使用
        //更多LocationClientOption的配置，请参照类参考中LocationClientOption类的详细说明
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailed() {

    }

    @Override
    public HomeContract.Presenter initPresenter() {
        return new HomePresenter(this);
    }

    @Override
    public void showWeatherView(BaseWeatherResponse<HeWeather6Bean> dataBean) {
        List<HeWeather6Bean> heWeather6 = dataBean.getHeWeather6();
        HeWeather6Bean heWeather6Bean = heWeather6.get(0);
        List<HeWeather6Bean.DailyForecastBean> daily_forecast = heWeather6Bean.getDaily_forecast();
        HeWeather6Bean.NowBean now = heWeather6Bean.getNow();
        List<HeWeather6Bean.LifestyleBean> lifestyle = heWeather6Bean.getLifestyle();
        HeWeather6Bean.UpdateBean update = heWeather6Bean.getUpdate();

        mTv_Temp.setText(now.getTmp()+ "℃");
        mTv_high.setText(daily_forecast.get(0).getTmp_max()+ "℃");
        mTv_low.setText(daily_forecast.get(0).getTmp_min()+ "℃");
        mTv_type.setText(now.getCond_txt());
        mTv_hum.setText(now.getHum()+"%");
        mTv_qi.setText(now.getPres());
        mTv_wind.setText(now.getWind_sc()+"级");

        /*List<WeatherBean.DataBean.ForecastBean> forecast = dataBean.getForecast();
        String city = dataBean.getCity();
        String wendu = dataBean.getWendu();
        String ganmao = dataBean.getGanmao();
        WeatherBean.DataBean.YesterdayBean yesterday = dataBean.getYesterday();*/


        /*mTvWendu.setText(wendu);
        mTv_type.setText(forecast.get(0).getType());
        mTv_high.setText(forecast.get(0).getHigh());
        mTv_low.setText(forecast.get(0).getLow());
        mTv_shidu.setText(forecast.get(0).getFengxiang());
        mTv_feng.setText(forecast.get(0).getFengli());
        mTv_qi.setText(forecast.get(0).getFengli());*/

        MyForecastAdapter myForecastAdapter = new MyForecastAdapter(daily_forecast);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mForecast.setLayoutManager(layoutManager);
        mForecast.setAdapter(myForecastAdapter);
    }

    @Override
    public void showAirView(BaseWeatherResponse<AirBean> dataBean) {
        List<AirBean> airBeans = dataBean.getHeWeather6();
        AirBean airBean = airBeans.get(0);
        List<AirBean.AirNowStationBean> air_now_station = airBean.getAir_now_station();
        AirBean.AirNowCityBean air_now_city = airBean.getAir_now_city();
        String aqi = air_now_city.getAqi();
        String co = air_now_city.getCo();
        String main = air_now_city.getMain();
        String no2 = air_now_city.getNo2();
        String o3 = air_now_city.getO3();
        String pm10 = air_now_city.getPm10();
        String pm25 = air_now_city.getPm25();
        String qlty = air_now_city.getQlty();
        String so2 = air_now_city.getSo2();
        String pub_time = air_now_city.getPub_time();

        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        mRv_aqi.setLayoutManager(manager);
        MyAqiAdapter myAqiAdapter = new MyAqiAdapter(air_now_city);
        mRv_aqi.setAdapter(myAqiAdapter);
    }


    private class MyLocationListener implements BDLocationListener {
        @Override
        public void onReceiveLocation(BDLocation bdLocation) {
            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    String province = bdLocation.getProvince();
                    String city = bdLocation.getCity();
                    mDistrict = bdLocation.getDistrict();
                    mLocation.setText(mDistrict);
                    Log.d(TAG, "run: " + province + city + mDistrict);
                    if (mDistrict!=null){

                        mPresenter.getWeatherData(mDistrict);
                        mPresenter.getAirData(mDistrict);
                    }
                }
            });
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mLocationClient.stop();
    }
}
