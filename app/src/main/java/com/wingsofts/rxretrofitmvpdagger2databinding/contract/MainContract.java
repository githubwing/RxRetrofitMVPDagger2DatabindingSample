package com.wingsofts.rxretrofitmvpdagger2databinding.contract;

import com.wingsofts.rxretrofitmvpdagger2databinding.bean.ApiBean;

import rx.Observable;

/**
 * Created by wing on 16/7/21.
 */
public interface MainContract {
    interface MainView{
        void showData(ApiBean.RetDataBean retDataBean);
        void showProgressBar();
    }



    interface MainPresenter{
        void getMainData();
    }

    interface MainModel{
        Observable loadMainData();
    }

}
