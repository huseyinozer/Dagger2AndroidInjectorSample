package me.huseyinozer.dagger2androidinjector.presentation.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;

import dagger.android.support.AndroidSupportInjection;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

public class BaseFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }
}
