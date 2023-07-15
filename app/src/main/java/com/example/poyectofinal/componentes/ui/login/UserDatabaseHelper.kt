package com.example.poyectofinal.componentes.ui.login

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class UserDatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "user.db"
        private const val TABLE_USERS = "users"
        private const val COLUMN_ID = "id"
        private const val COLUMN_NAME = "name"
        private const val COLUMN_EMAIL = "email"
        private const val COLUMN_PASSWORD = "password"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createTableQuery = "CREATE TABLE $TABLE_USERS ($COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, $COLUMN_NAME TEXT, $COLUMN_EMAIL TEXT, $COLUMN_PASSWORD TEXT)"
        db.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_USERS")
        onCreate(db)
    }

    fun insertUser(user: UserModel): Long {
        val values = ContentValues()
        values.put(COLUMN_NAME, user.name)
        values.put(COLUMN_EMAIL, user.email)
        values.put(COLUMN_PASSWORD, user.password)
        val db = writableDatabase
        return db.insert(TABLE_USERS, null, values)
    }


    @SuppressLint("Range")
    fun getAllUsers(): List<UserModel> {
        val userList = mutableListOf<UserModel>()
        val selectQuery = "SELECT * FROM $TABLE_USERS"
        val db = readableDatabase
        val cursor = db.rawQuery(selectQuery, null)
        if (cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(cursor.getColumnIndex(COLUMN_ID))
                val name = cursor.getString(cursor.getColumnIndex(COLUMN_NAME))
                val email = cursor.getString(cursor.getColumnIndex(COLUMN_EMAIL))
                val password = cursor.getString(cursor.getColumnIndex(COLUMN_PASSWORD))
                val user = UserModel(id, name, email, password)
                userList.add(user)
            } while (cursor.moveToNext())
        }
        cursor.close()
        return userList
    }
}
