package com.wingsofts.rxretrofitmvpdagger2databinding.model;

import android.view.View;

import com.wingsofts.rxretrofitmvpdagger2databinding.Constant;
import com.wingsofts.rxretrofitmvpdagger2databinding.api.DataApi;
import com.wingsofts.rxretrofitmvpdagger2databinding.bean.ApiBean;
import com.wingsofts.rxretrofitmvpdagger2databinding.contract.MainContract;


import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by wing on 16/7/21.
 */
public class MainModelImpl implements MainContract.MainModel {

    private DataApi mApi;

    public MainModelImpl() {
        //创建Retrofit的  Observable
        mApi = new Retrofit.Builder().baseUrl(Constant.HOST).addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build().create(DataApi.class);
    }

    @Override
    public Observable<ApiBean> loadMainData() {
        return mApi.getData();
    }
}
