package com.zhouzhi.allknowweather.net;

import com.zhouzhi.allknowweather.base.UrlConstants;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {


    private static OkHttpClient getOkHttpClient(){
        final HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient mOkHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();

        return mOkHttpClient;
    }


    public static Retrofit getRetrofit(){
         Retrofit mRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(UrlConstants.HE_WEATHER_URL)
                .client(getOkHttpClient())
                .build();
         return mRetrofit;
    }


   public static Api getApi() {
       Api api = getRetrofit().create(Api.class);
       return api;
   }
}
