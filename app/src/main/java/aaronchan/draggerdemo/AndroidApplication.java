package aaronchan.draggerdemo;

import android.app.Application;

import aaronchan.draggerdemo.di.components.ApplicationComponent;

/**
 * Created by Administrator on 2016/4/13.
 */
public class AndroidApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
