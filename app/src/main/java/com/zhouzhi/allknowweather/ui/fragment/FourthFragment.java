package com.zhouzhi.allknowweather.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.zhouzhi.allknowweather.R;
import com.zhouzhi.allknowweather.base.BaseFragment;

public class FourthFragment extends BaseFragment {
    public static FourthFragment newInstance(){
        Bundle bundle = new Bundle();
        FourthFragment fourthFragment = new FourthFragment();
        fourthFragment.setArguments(bundle);
        return fourthFragment;
    }
    @Override
    protected void initRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_four,container,false);
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initData(boolean isSavedInstanceState) {

    }
}
