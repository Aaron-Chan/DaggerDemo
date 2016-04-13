package aaronchan.draggerdemo;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import aaronchan.draggerdemo.di.components.DaggerApplicationComponent;
import aaronchan.draggerdemo.di.modules.ApplicationModule;

public class MainActivity extends AppCompatActivity {
    @Inject
    Application application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(getApplication())).build().inject(this);
        Toast.makeText(application.getApplicationContext(),"利用application发出的toast",Toast.LENGTH_SHORT).show();
    }
}
