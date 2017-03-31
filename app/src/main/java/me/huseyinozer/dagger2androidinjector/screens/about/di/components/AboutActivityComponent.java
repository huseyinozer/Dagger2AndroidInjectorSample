package me.huseyinozer.dagger2androidinjector.screens.about.di.components;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import me.huseyinozer.dagger2androidinjector.di.ActivityScope;
import me.huseyinozer.dagger2androidinjector.screens.about.di.modules.AboutActivityModule;
import me.huseyinozer.dagger2androidinjector.screens.about.activities.AboutActivity;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

@ActivityScope
@Subcomponent(
        modules = AboutActivityModule.class
)
public interface AboutActivityComponent extends AndroidInjector<AboutActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AboutActivity> {
    }
}
