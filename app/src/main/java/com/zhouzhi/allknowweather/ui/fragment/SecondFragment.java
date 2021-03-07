package com.zhouzhi.allknowweather.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.zhouzhi.allknowweather.R;
import com.zhouzhi.allknowweather.base.BaseFragment;

public class SecondFragment extends BaseFragment {
    public static SecondFragment newInstance(){
        Bundle args = new Bundle();
        SecondFragment secondFragment = new SecondFragment();
        secondFragment.setArguments(args);
        return secondFragment;
    }
    @Override
    protected void initRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_second,container,false);
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initData(boolean isSavedInstanceState) {

    }
}
