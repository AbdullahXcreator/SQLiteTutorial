package com.blogspot.codesgram.sqlitetutorial;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    // Versi Database
    private static final int DATABASE_VERSION = 1;

    // Database name
    private static final String DATABASE_NAME = "NilaiSiswa";

    // table name
    private static final String TABLE_NILAI = "nilai";

    // column tables
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "user";
    private static final String KEY_NILAI = "nilai";

    public MyDatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Create table
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_NILAI + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
                + KEY_NILAI + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    // on Upgrade database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NILAI);
        onCreate(db);
    }
}
