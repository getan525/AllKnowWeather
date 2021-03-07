package com.zhouzhi.allknowweather.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zhouzhi.allknowweather.R;
import com.zhouzhi.allknowweather.base.BaseApplication;
import com.zhouzhi.allknowweather.bean.AirBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyAqiAdapter extends RecyclerView.Adapter<MyAqiAdapter.ViewHolder> {
    List<AirBean.AirNowCityBean> mAirNowCityBeans = new ArrayList<>();
    public MyAqiAdapter(AirBean.AirNowCityBean air_now_city) {
        this.mAirNowCityBeans = (List<AirBean.AirNowCityBean>) air_now_city;
    }

    @NonNull
    @Override
    public MyAqiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(BaseApplication.mContext).inflate(R.layout.item_forecast, parent);
        ViewHolder view = new ViewHolder(inflate);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAqiAdapter.ViewHolder holder, int position) {
        AirBean.AirNowCityBean airNowCityBean = mAirNowCityBeans.get(position);
        holder.tv_aqi_name.setText(airNowCityBean.getMain());

    }

    @Override
    public int getItemCount() {
        return mAirNowCityBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_aqi_name)
        TextView tv_aqi_name;
        @BindView(R.id.tv_aqi_desc)
        TextView tv_aqi_desc;
        @BindView(R.id.tv_aqi_value)
        TextView tv_aqi_value;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ButterKnife.bind(this,itemView);
        }
    }
}
