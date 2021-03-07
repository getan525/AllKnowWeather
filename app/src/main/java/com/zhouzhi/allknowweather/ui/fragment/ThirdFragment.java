package com.zhouzhi.allknowweather.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.zhouzhi.allknowweather.R;
import com.zhouzhi.allknowweather.base.BaseFragment;

public class ThirdFragment extends BaseFragment {
    public static ThirdFragment newInstance(){
        Bundle bundle = new Bundle();
        ThirdFragment thirdFragment = new ThirdFragment();
        thirdFragment.setArguments(bundle);
        return thirdFragment;
    }
    @Override
    protected void initRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_third,container,false);
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initData(boolean isSavedInstanceState) {

    }
}
