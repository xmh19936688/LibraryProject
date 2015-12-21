package com.xmh.toucheventdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.xmh.toucheventdemo.util.TouchEventUtil;

/**
 * Created by mengh on 2015/12/21 021.
 */
public class MyView extends View{
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("xmh", getTag() + "-dispatch:" + TouchEventUtil.getTouchActionName(event));
        return super.dispatchTouchEvent(event);
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("xmh", getTag() + "-touch:" + TouchEventUtil.getTouchActionName(event));
        return super.onTouchEvent(event);
//        return true;
    }
}
