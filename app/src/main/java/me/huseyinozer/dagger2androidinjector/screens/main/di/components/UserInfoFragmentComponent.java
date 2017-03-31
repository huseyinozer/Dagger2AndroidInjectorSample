package me.huseyinozer.dagger2androidinjector.screens.main.di.components;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import me.huseyinozer.dagger2androidinjector.di.FragmentScope;
import me.huseyinozer.dagger2androidinjector.screens.main.di.modules.UserInfoFragmentModule;
import me.huseyinozer.dagger2androidinjector.screens.main.fragments.UserInfoFragment;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

@FragmentScope
@Subcomponent(
        modules = UserInfoFragmentModule.class
)
public interface UserInfoFragmentComponent extends AndroidInjector<UserInfoFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<UserInfoFragment> {
    }
}
