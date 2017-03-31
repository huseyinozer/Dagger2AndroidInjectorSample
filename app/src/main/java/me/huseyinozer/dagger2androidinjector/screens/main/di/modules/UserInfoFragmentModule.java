package me.huseyinozer.dagger2androidinjector.screens.main.di.modules;

import dagger.Module;
import dagger.Provides;
import me.huseyinozer.dagger2androidinjector.di.FragmentScope;
import me.huseyinozer.dagger2androidinjector.screens.main.models.UserModel;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

@Module
public class UserInfoFragmentModule {

    @FragmentScope
    @Provides
    UserModel provideUserModel() {
        return new UserModel("Huseyin", "Ozer");
    }

}
