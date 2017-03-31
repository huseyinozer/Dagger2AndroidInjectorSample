package me.huseyinozer.dagger2androidinjector.di.components;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import me.huseyinozer.dagger2androidinjector.App;
import me.huseyinozer.dagger2androidinjector.di.modules.ActivityModule;
import me.huseyinozer.dagger2androidinjector.di.modules.ApplicationModule;
import me.huseyinozer.dagger2androidinjector.di.modules.FragmentModule;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

@Singleton
@Component(
        modules = {
                ApplicationModule.class,
                ActivityModule.class,
                FragmentModule.class
        }
)
public interface ApplicationComponent {
    Context context();

    void inject(App app);
}
