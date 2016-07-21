package com.wingsofts.rxretrofitmvpdagger2databinding.di.component;

import com.wingsofts.rxretrofitmvpdagger2databinding.di.module.MainModule;
import com.wingsofts.rxretrofitmvpdagger2databinding.presenter.MainPresenterImpl;

import dagger.Component;

/**
 * Created by wing on 16/7/21.
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    MainPresenterImpl getPresenter();
}
