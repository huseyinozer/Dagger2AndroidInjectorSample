package me.huseyinozer.dagger2androidinjector.di.modules;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import me.huseyinozer.dagger2androidinjector.screens.about.activities.AboutActivity;
import me.huseyinozer.dagger2androidinjector.screens.about.di.components.AboutActivityComponent;
import me.huseyinozer.dagger2androidinjector.screens.main.activities.MainActivity;
import me.huseyinozer.dagger2androidinjector.screens.main.di.components.MainActivityComponent;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

@Module(
        subcomponents = {
                MainActivityComponent.class,
                AboutActivityComponent.class
        }
)
public abstract class ActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(MainActivityComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(AboutActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindAboutActivityInjectorFactory(AboutActivityComponent.Builder builder);

}
