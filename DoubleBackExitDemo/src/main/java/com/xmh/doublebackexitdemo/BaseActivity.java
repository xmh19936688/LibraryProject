package com.xmh.doublebackexitdemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

public class BaseActivity extends AppCompatActivity {

    public static final int SHOW_TOAST_MSG = 100;
    private long clickTime = 0;              //记录第一次点击的时间

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /*Toast提示处理*/
    @SuppressLint("HandlerLeak")
    public Handler mToastHandler = new Handler(){
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case SHOW_TOAST_MSG:
                    String str = (String)msg.obj;
                    if(!TextUtils.isEmpty(str)){
                        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
                    }
                    break;
                default:
                    break;
            }
        }
    };

    /**
     * 退出应用
     */
    public void exitApp() {
        if ((System.currentTimeMillis() - clickTime) > 2000) {
            Toast.makeText(this, "再按一次后退键退出程序", Toast.LENGTH_SHORT).show();
            clickTime = System.currentTimeMillis();
        } else {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            startActivity(intent);
            System.exit(0);
        }
    }

}
