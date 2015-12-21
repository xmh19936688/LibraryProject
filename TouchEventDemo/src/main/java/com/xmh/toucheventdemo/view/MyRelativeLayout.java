package com.xmh.toucheventdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

import com.xmh.toucheventdemo.util.TouchEventUtil;

/**
 * Created by mengh on 2015/12/21 021.
 */
public class MyRelativeLayout extends RelativeLayout{

    public MyRelativeLayout(Context context) {
        super(context);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("xmh", getTag()+"-dispatch:" + TouchEventUtil.getTouchActionName(event));
        return super.dispatchTouchEvent(event);
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("xmh", getTag()+"-touch:" + TouchEventUtil.getTouchActionName(event));
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.e("xmh", getTag()+"-intercept:" + TouchEventUtil.getTouchActionName(event));
        return super.onInterceptTouchEvent(event);
//        return true;
    }
}
