package me.huseyinozer.dagger2androidinjector;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;
import me.huseyinozer.dagger2androidinjector.di.components.DaggerApplicationComponent;
import me.huseyinozer.dagger2androidinjector.di.modules.ApplicationModule;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

public class App extends Application implements HasDispatchingActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build()
                .inject(this);
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
