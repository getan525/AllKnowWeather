package com.zhouzhi.allknowweather.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zhouzhi.allknowweather.R;
import com.zhouzhi.allknowweather.base.BaseApplication;
import com.zhouzhi.allknowweather.bean.HeWeather6Bean;
import com.zhouzhi.allknowweather.bean.WeatherBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyForecastAdapter extends RecyclerView.Adapter<MyForecastAdapter.ViewHolder> {
    List<HeWeather6Bean.DailyForecastBean> mForecastBeanList;
    public MyForecastAdapter(List<HeWeather6Bean.DailyForecastBean> forecast) {
        mForecastBeanList = forecast;
    }

    @NonNull
    @Override
    public MyForecastAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(BaseApplication.mContext).inflate(R.layout.item_forecast, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyForecastAdapter.ViewHolder holder, int position) {
        HeWeather6Bean.DailyForecastBean dailyForecastBean = mForecastBeanList.get(position);
        holder.mshidu.setText(dailyForecastBean.getHum());
        holder.mfengli.setText(dailyForecastBean.getWind_deg());
        holder.mqiya.setText(dailyForecastBean.getPres());
    }


    @Override
    public int getItemCount() {
        return mForecastBeanList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_humidity)
        TextView mshidu;
        @BindView(R.id.tv_wind)
        TextView mfengli;
        @BindView(R.id.tv_pres)
        TextView mqiya;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
