package com.xmh.iocdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_test1) TextView tvT1;
    @Bind(R.id.tv_test2) TextView tvT2;
    @Bind(R.id.tv_test3) TextView tvT3;
    @Bind(R.id.tv_test4) TextView tvT4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvT1.setText("text");
    }

    @OnClick({R.id.tv_test1,R.id.tv_test2})
    void test1Clicked(View v){
        Toast.makeText(this,v.getId()+"",Toast.LENGTH_SHORT).show();
    }

}
