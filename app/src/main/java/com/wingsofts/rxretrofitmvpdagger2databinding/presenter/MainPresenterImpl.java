package com.wingsofts.rxretrofitmvpdagger2databinding.presenter;

import android.util.Log;

import com.wingsofts.rxretrofitmvpdagger2databinding.bean.ApiBean;
import com.wingsofts.rxretrofitmvpdagger2databinding.contract.MainContract;
import com.wingsofts.rxretrofitmvpdagger2databinding.model.MainModelImpl;

import javax.inject.Inject;
import javax.security.auth.login.LoginException;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by wing on 16/7/21.
 */
public class MainPresenterImpl implements MainContract.MainPresenter {
    private MainContract.MainView mMainView;
    private MainContract.MainModel mMainModel;

    @Inject
    public MainPresenterImpl(MainContract.MainView mainView) {
        mMainView = mainView;
        mMainModel = new MainModelImpl();
    }

    @Override
    public void getMainData() {
        mMainModel.loadMainData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<ApiBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(ApiBean apiBean) {
                        mMainView.showData(apiBean.getRetData());
                        Log.e("wing","onNext");
                    }


                });
    }
}
