package com.zhouzhi.allknowweather.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

import com.zhouzhi.allknowweather.MainActivity;
import com.zhouzhi.allknowweather.R;
import com.zhouzhi.allknowweather.base.BaseFragment;
import com.zhouzhi.allknowweather.bean.AirBean;
import com.zhouzhi.allknowweather.bean.BaseWeatherResponse;
import com.zhouzhi.allknowweather.bean.HeWeather6Bean;
import com.zhouzhi.allknowweather.mvp.contract.HomeContract;
import com.zhouzhi.allknowweather.mvp.presenter.HomePresenter;

import butterknife.BindView;

public class HomeFragment extends BaseFragment implements HomeContract.View {
    @BindView(R.id.toolbar)
    Toolbar mbar;

    HomePresenter mHomePresenter;

    public static HomeFragment newInstance(){
        Bundle args = new Bundle();
        HomeFragment homeFragment = new HomeFragment();
        homeFragment.setArguments(args);
        return homeFragment;
    }
    @Override
    protected void initRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_home, container,false);
        mbar = mRootView.findViewById(R.id.toolbar);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //setToolbar(mToolbar);
        ((MainActivity)getActivity()).setToolbar(mbar);
    }



    @Override
    protected void initData(boolean isSavedInstanceState) {

    }

    @Override
    protected void initEvent() {

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
    public void setPresenter(HomeContract.Presenter presenter) {
        mHomePresenter = (HomePresenter) presenter;
    }


    /*@Override
    public void showView(BaseWeatherResponse<HeWeather6Bean> dataBean) {

    }*/

    @Override
    public void showWeatherView(BaseWeatherResponse<HeWeather6Bean> dataBean) {

    }

    @Override
    public void showAirView(BaseWeatherResponse<AirBean> dataBean) {

    }
}
