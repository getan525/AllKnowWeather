package com.zhouzhi.allknowweather.mvp.contract;

public interface BaseContract {
    interface BaseView<P extends BasePresenter>{
        void showLoading();
        void hideLoading();
        void onSuccess();
        void onFailed();
        void setPresenter(P p);
    }

    interface BasePresenter{

    }
}
