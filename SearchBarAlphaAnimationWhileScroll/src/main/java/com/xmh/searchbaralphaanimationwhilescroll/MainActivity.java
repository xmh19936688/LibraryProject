package com.xmh.searchbaralphaanimationwhilescroll;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.PullToRefreshScrollView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_search)TextView tvSearch;
    @Bind(R.id.ptr_sv_main)PullToRefreshScrollView ptrContent;
    @Bind(R.id.tv_content)TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        ptrContent.getId();


        ScrollView scrollView = ptrContent.getRefreshableView();

//        scrollView.setOnTouchListener(new OnContentTouchListener());


        scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

            }
        });
    }

    private class  OnContentTouchListener implements View.OnTouchListener{
        @Override
        public boolean onTouch(View view, MotionEvent event) {
            Log.e("scroll-xmh", view.getScrollY() + "");
            int alpha=view.getScrollY();
            if(view.getScrollY()>255)alpha=255;
            if(view.getScrollY()<0) alpha=0;
            tvSearch.getBackground().setAlpha(alpha);
            return false;
        }
    }

}
