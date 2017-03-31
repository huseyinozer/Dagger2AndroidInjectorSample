package me.huseyinozer.dagger2androidinjector.di.modules;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    public Context provideContext() {
        return application.getApplicationContext();
    }
}
