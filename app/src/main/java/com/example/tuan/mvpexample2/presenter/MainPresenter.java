package com.example.tuan.mvpexample2.presenter;

import com.example.tuan.mvpexample2.model.LoadDemoListener;
import com.example.tuan.mvpexample2.model.UserIterator;
import com.example.tuan.mvpexample2.model.entity.Demo;
import com.example.tuan.mvpexample2.view.MainView;

import java.util.List;

public class MainPresenter implements LoadDemoListener {
    private UserIterator mMainInterator;
    private MainView mMainView;

    public MainPresenter(MainView mainView) {
        mMainInterator = new UserIterator(this);
        mMainView = mainView;
    }
    public void loadData() {
        mMainInterator.createListData();
    }

    @Override
    public void onLoadDemoSuccess(List<Demo> listDemo) {
        mMainView.displayMain(listDemo);
    }

    @Override
    public void onLoadDemoFailure(String message) {

    }
}
