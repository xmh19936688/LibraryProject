package com.xmh.customtoastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btnShow= (Button) findViewById(R.id.btn_show);

        btnShow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_show:
                Toast toast = new Toast(this);
                View view = LayoutInflater.from(this).inflate(R.layout.layout_toast,null);
                Button btn= (Button) view.findViewById(R.id.btn_another);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"demo",Toast.LENGTH_SHORT).show();
                    }
                });
                toast.setView(view);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
                break;
        }
    }
}
