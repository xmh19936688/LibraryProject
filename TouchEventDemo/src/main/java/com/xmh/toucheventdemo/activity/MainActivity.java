package com.xmh.toucheventdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

import com.xmh.toucheventdemo.R;
import com.xmh.toucheventdemo.util.TouchEventUtil;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.out)RelativeLayout rlOut;
    @Bind(R.id.view)View vUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("xmh","activity-dispatch:"+ TouchEventUtil.getTouchActionName(event));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("xmh","activity-touch:"+ TouchEventUtil.getTouchActionName(event));
        return super.onTouchEvent(event);
    }
}
