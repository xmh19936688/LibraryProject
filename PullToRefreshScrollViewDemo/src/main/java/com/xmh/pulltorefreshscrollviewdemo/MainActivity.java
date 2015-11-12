package com.xmh.pulltorefreshscrollviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ScrollView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PullToRefreshScrollView pullToRefreshScrollView = (PullToRefreshScrollView) findViewById(R.id.ptr_sv_main);

        pullToRefreshScrollView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ScrollView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ScrollView> refreshView) {
                refreshView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        pullToRefreshScrollView.onRefreshComplete();
                    }
                },1000);
            }
        });

    }
}
