package aaronchan.daggerdemo;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import aaronchan.daggerdemo.di.components.DaggerApplicationComponent;
import aaronchan.daggerdemo.di.modules.ApplicationModule;

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
