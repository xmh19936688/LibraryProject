package com.xmh.kjdbdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.kymjs.kjframe.KJDB;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bean bean=new Bean();
        bean.setId("ss");
        bean.setValue("b");

        KJDB db=KJDB.create(this,true);
        db.update(bean);

        List<Bean> allByWhere = db.findAllByWhere(Bean.class, "id='ss' and value='b'");
        if(allByWhere.size()>0){
            allByWhere.get(0).getId();
        }
    }
}
