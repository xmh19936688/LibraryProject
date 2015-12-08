package com.xmh.customviewwithanimationdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xmh.customviewwithanimationdemo.R;
import com.xmh.customviewwithanimationdemo.view.CusView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.cv_view)
    CusView view;
    @Bind(R.id.btn_button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_button)
    void onClick(){
        view.setVisibility(View.VISIBLE);
        view.show();
    }
}
