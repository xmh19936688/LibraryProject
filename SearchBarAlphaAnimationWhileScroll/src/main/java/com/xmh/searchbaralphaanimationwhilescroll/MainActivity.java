package com.xmh.searchbaralphaanimationwhilescroll;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
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

        tvSearch.getBackground().setAlpha(0);

        ScrollView scrollView = ptrContent.getRefreshableView();

        scrollView.setOnTouchListener(new OnContentTouchListener());


//        scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
//            @Override
//            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
//
//            }
//        });

        ptrContent.setOnPullEventListener(new PullToRefreshBase.OnPullEventListener<ScrollView>() {
            @Override
            public void onPullEvent(PullToRefreshBase<ScrollView> refreshView, PullToRefreshBase.State state, PullToRefreshBase.Mode direction) {
                switch (state){
                    case PULL_TO_REFRESH:
                        tvSearch.setVisibility(View.GONE);
                        Log.e("state_xmh","PULL_TO_REFRESH");
                        break;
                    case RESET:
                        tvSearch.setVisibility(View.VISIBLE);
                        Log.e("state_xmh","RESET");
                        break;
                    case RELEASE_TO_REFRESH:
                        Log.e("state_xmh","RELEASE_TO_REFRESH");
                        break;
                    case REFRESHING:
                        Log.e("state_xmh","REFRESHING");
                        break;
                    case MANUAL_REFRESHING:
                        Log.e("state_xmh","MANUAL_REFRESHING");
                        break;
                    case OVERSCROLLING:
                        Log.e("state_xmh","OVERSCROLLING");
                        tvSearch.setVisibility(View.VISIBLE);
                        tvSearch.getBackground().setAlpha(0);
                        break;
                }
            }
        });

        ptrContent.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ScrollView>() {
            @Override
            public void onRefresh(final PullToRefreshBase<ScrollView> refreshView) {
                refreshView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refreshView.onRefreshComplete();
                    }
                },1000);
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
