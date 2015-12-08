package com.xmh.sqldemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mengh on 2015/10/29 029.
 */
public class SqlHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "sqldemo.db";// 数据库名称
    public static final int VERSION = 1;

    public static final String TABLE_TAG = "t_tag";//数据表

    public static final String ID = "id";//
    public static final String NAME = "name";
    public static final String ORDERCOUNT = "orderCount";
    private Context context;

    public SqlHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
        this.context = context;
    }

    public Context getContext(){
        return context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO 创建数据库后，对数据库的操作
        String sql = "create table if not exists "+TABLE_TAG +
                "(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ID + " INTEGER , " +
                NAME + " TEXT , " +
                ORDERCOUNT + " INTEGER)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO 更改数据库版本的操作
        onCreate(db);
    }
}
