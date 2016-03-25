package com.xmh.sqldemo;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by mengh on 2015/11/27 027.
 */
public class DemoApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        SQLiteDatabase db = openOrCreateDatabase("sql.db", MODE_PRIVATE, null);
        db.execSQL("");
        db.execSQL("",null);
        db.rawQuery("",null);
    }
}
