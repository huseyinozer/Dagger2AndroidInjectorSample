package me.huseyinozer.dagger2androidinjector.di.modules;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import me.huseyinozer.dagger2androidinjector.screens.main.di.components.UserInfoFragmentComponent;
import me.huseyinozer.dagger2androidinjector.screens.main.fragments.UserInfoFragment;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

@Module(
        subcomponents = {
                UserInfoFragmentComponent.class
        }
)
public abstract class FragmentModule {

    @Binds
    @IntoMap
    @FragmentKey(UserInfoFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindUserInfoFragmentInjectorFactory(UserInfoFragmentComponent.Builder builder);
}
