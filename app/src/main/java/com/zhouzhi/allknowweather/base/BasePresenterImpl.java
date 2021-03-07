package com.zhouzhi.allknowweather.base;

import com.zhouzhi.allknowweather.mvp.contract.BaseContract;

public  class BasePresenterImpl<V extends BaseContract.BaseView> implements BaseContract.BasePresenter {

    private V mV;
    public BasePresenterImpl(V v){
        this.mV = v;
        this.mV.setPresenter(this);
    }

    protected V getView(){
        return mV;
    }
}
