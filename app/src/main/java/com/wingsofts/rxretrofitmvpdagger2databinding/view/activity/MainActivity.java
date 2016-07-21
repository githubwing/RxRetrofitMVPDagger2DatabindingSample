package com.wingsofts.rxretrofitmvpdagger2databinding.view.activity;

import android.app.ProgressDialog;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wingsofts.rxretrofitmvpdagger2databinding.R;
import com.wingsofts.rxretrofitmvpdagger2databinding.bean.ApiBean;
import com.wingsofts.rxretrofitmvpdagger2databinding.contract.MainContract;
import com.wingsofts.rxretrofitmvpdagger2databinding.databinding.ActivityMainBinding;
import com.wingsofts.rxretrofitmvpdagger2databinding.di.component.DaggerMainComponent;
import com.wingsofts.rxretrofitmvpdagger2databinding.di.module.MainModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {
    private ActivityMainBinding mBinding;
    MainContract.MainPresenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mPresenter = DaggerMainComponent.builder().mainModule(new MainModule(this)).build().getPresenter();
    }

    public void getData(View view) {
        //使用presenter操作M与V的交互
        mPresenter.getMainData();
    }

    @Override
    public void showData(ApiBean.RetDataBean retDataBean) {
        mBinding.setPhone(retDataBean);
    }

    @Override
    public void showProgressBar() {
        new ProgressDialog.Builder(this).setMessage("loading").create().show();
    }
}
