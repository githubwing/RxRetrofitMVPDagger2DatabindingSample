package com.wingsofts.rxretrofitmvpdagger2databinding.di.module;

import com.wingsofts.rxretrofitmvpdagger2databinding.contract.MainContract;
import com.wingsofts.rxretrofitmvpdagger2databinding.view.activity.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wing on 16/7/21.
 */
@Module
public class MainModule {
    private MainContract.MainView mMainView;

    public MainModule(MainContract.MainView mMainView) {
        this.mMainView = mMainView;
    }
    @Provides
    public MainContract.MainView inject(){
        return mMainView;
    };
}
