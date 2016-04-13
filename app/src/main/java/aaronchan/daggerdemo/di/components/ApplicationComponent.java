package aaronchan.daggerdemo.di.components;

import javax.inject.Singleton;

import aaronchan.daggerdemo.MainActivity;
import aaronchan.daggerdemo.di.modules.ApplicationModule;
import dagger.Component;

/**
 * Created by Administrator on 2016/4/13.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);
}
