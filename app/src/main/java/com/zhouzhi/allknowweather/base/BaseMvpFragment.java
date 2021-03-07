package com.zhouzhi.allknowweather.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.zhouzhi.allknowweather.mvp.contract.BaseContract;

public abstract class BaseMvpFragment<P extends BaseContract.BasePresenter> extends BaseFragment implements BaseContract.BaseView<P> {
    protected P mPresenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        initPresenter();
    }

    public abstract P initPresenter();

    @Override
    public void setPresenter(P presenter) {
        mPresenter = presenter;
    }
}
