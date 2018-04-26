package com.example.exclusive.first_needs;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class DataBaseHelper extends SQLiteOpenHelper {
    public static  final String DATABASE_NAME = "firstneeds.db";
    public static  final String TABLE_NAME = "register";
    public static  final String Col_1= "USERNAME";
    public static  final String Col_2= "MOBILE_NUMBER";
    public static  final String Col_3= "PASSWORD";
    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (USERNAME TEXT,MOBILE_NUMBER INTEGER,PASSWORD TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
onCreate(db);
    }
}
