package com.zhouzhi.allknowweather.base;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

public class BaseApplication extends Application {
    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();

        // 添加下面这个
        MultiDex.install(this);
    }

    private static Context getContext(){
        return mContext;
    }
}
