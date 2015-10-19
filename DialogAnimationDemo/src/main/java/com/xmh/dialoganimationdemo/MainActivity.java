package com.xmh.dialoganimationdemo;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dialog dialog = new Dialog(this,R.style.dialog_style);
        dialog.setContentView(R.layout.dialog_loading);
        dialog.setCanceledOnTouchOutside(true);//点击空白处消失
        dialog.getWindow().setWindowAnimations(R.style.dialog_style);//dialog的动画要设置在window上
        dialog.show();

    }

}
