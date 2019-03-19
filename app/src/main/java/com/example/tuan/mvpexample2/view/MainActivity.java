package com.example.tuan.mvpexample2.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.tuan.mvpexample2.R;
import com.example.tuan.mvpexample2.model.entity.Demo;
import com.example.tuan.mvpexample2.presenter.MainPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    private Button mButtonLoad;
    private ListView mListData;
    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPresenter();
        mButtonLoad = findViewById(R.id.button_load_data);
        mListData = findViewById(R.id.list_data);
        mButtonLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainPresenter.loadData();
            }
        });
    }

    private void initPresenter() {
        mMainPresenter = new MainPresenter(this);
    }

    @Override
    public void displayMain(List<Demo> listDemo) {
        mListData.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listDemo));
    }
}
