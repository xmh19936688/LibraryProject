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
        bean.setId("sssx");
        bean.setValue("b");
        bean.setNext("dfd");
        bean.setOrder(10);

        KJDB db=KJDB.create(this,true);
        for(Bean item:db.findAll(Bean.class)){
            db.delete(item);
        }
        db.save(bean);

        List<Bean> allByWhere = db.findAllByWhere(Bean.class, "order='10'");
        if(allByWhere.size()>0){
            allByWhere.get(0).getId();
        }

//        db.save(allByWhere);
    }
}
