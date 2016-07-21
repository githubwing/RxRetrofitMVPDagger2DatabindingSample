package com.wingsofts.rxretrofitmvpdagger2databinding.api;

import com.wingsofts.rxretrofitmvpdagger2databinding.bean.ApiBean;

import rx.Observable;

import retrofit2.http.GET;

/**
 * Created by wing on 16/7/21.
 */
    public interface DataApi {
    @GET("api.php")Observable<ApiBean> getData();

}
