package com.xmh.customviewwithanimationdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.xmh.customviewwithanimationdemo.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by mengh on 2015/12/8 008.
 */
public class CusView extends LinearLayout{

    private Context mContext;
    private View mRootView;
    @Bind(R.id.iv_image)ImageView ivImage;

    public CusView(Context context) {
        this(context, null);
    }

    public CusView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CusView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext=context;
        mRootView= LayoutInflater.from(context).inflate(R.layout.layout_view,this,true);
        ButterKnife.bind(this,mRootView);
    }

    public void show(){
        LinearLayout.LayoutParams layoutParams = (LayoutParams) ivImage.getLayoutParams();
        layoutParams.topMargin=ivImage.getHeight()/2;
        ivImage.setLayoutParams(layoutParams);

        Animation shakeAnim = AnimationUtils.loadAnimation(mContext, R.anim.view_anim);
        ivImage.startAnimation(shakeAnim);
    }
}
