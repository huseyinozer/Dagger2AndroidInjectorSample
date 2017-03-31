package me.huseyinozer.dagger2androidinjector.screens.main.di.modules;

import dagger.Module;
import dagger.Provides;
import me.huseyinozer.dagger2androidinjector.di.ActivityScope;
import me.huseyinozer.dagger2androidinjector.screens.main.models.MainModel;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

@Module
public class MainActivityModule {

    @ActivityScope
    @Provides
    MainModel provideMainModel() {
        return new MainModel("Welcome");
    }

}
