package me.huseyinozer.dagger2androidinjector.screens.about.di.modules;

import dagger.Module;
import dagger.Provides;
import me.huseyinozer.dagger2androidinjector.di.ActivityScope;
import me.huseyinozer.dagger2androidinjector.screens.about.models.AboutModel;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

@Module
public class AboutActivityModule {

    @ActivityScope
    @Provides
    AboutModel provideUserModel() {
        return new AboutModel("Huseyin Ozer", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
    }

}
