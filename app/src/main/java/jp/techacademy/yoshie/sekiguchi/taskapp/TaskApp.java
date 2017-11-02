package jp.techacademy.yoshie.sekiguchi.taskapp;

import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();

        //Realm初期化
        Realm.init(this);
    }

}
