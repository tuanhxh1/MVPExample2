package com.example.tuan.mvpexample2.model;

import com.example.tuan.mvpexample2.model.entity.Demo;
import java.util.List;

public interface LoadDemoListener {
    void onLoadDemoSuccess(List<Demo> listDemo);
    void onLoadDemoFailure(String message);
}
