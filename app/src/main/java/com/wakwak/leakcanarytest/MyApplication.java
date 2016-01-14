package com.wakwak.leakcanarytest;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by Ryo on 2016/01/15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            LeakCanary.install(this);
        } catch (Exception ignore) {

        }
    }
}
