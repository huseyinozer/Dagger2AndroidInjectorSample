package me.huseyinozer.dagger2androidinjector.screens.main.di.components;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import me.huseyinozer.dagger2androidinjector.di.ActivityScope;
import me.huseyinozer.dagger2androidinjector.screens.main.activities.MainActivity;
import me.huseyinozer.dagger2androidinjector.screens.main.di.modules.MainActivityModule;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

@ActivityScope
@Subcomponent(
        modules = MainActivityModule.class
)
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
