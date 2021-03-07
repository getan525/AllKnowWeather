package com.zhouzhi.allknowweather.base;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {
    protected   final String TAG = getClass().getName();
    protected View mRootView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initRootView(inflater,container,savedInstanceState);
        ButterKnife.bind(this,mRootView);
        Log.d(TAG, "onCreateView: ");
        initEvent();
        initData(savedInstanceState == null);
        return mRootView;
    }

    protected abstract void initRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    protected abstract void initEvent();

    protected abstract void initData(boolean isSavedInstanceState);



}
