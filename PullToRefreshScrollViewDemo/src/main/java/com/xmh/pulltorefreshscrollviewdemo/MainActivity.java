package com.xmh.pulltorefreshscrollviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.handmark.pulltorefresh.library.PullToRefreshScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PullToRefreshScrollView pullToRefreshScrollView = new PullToRefreshScrollView(this);

    }
}
