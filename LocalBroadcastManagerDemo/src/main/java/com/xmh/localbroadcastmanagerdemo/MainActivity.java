package com.xmh.localbroadcastmanagerdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_send)Button btnSend;

    private static String EVENT_INTENT_ACTION="com.xmh.intent.action";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //注册一个receiver
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction(EVENT_INTENT_ACTION);
        LocalBroadcastManager.getInstance(this).registerReceiver(new BroadcastReceiver(){
            @Override
            public void onReceive(Context context, Intent intent) {
                //接收后的动作
                method();
            }
        },intentFilter);
    }

    @OnClick(R.id.btn_send)
    void onSendClick(View view){
        //发送一个广播
        Intent intent =new Intent();
        intent.setAction(EVENT_INTENT_ACTION);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    private void method(){
        btnSend.setText("dsdsdfsd");
    }
}
