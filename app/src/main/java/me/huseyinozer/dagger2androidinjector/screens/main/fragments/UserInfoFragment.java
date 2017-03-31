package me.huseyinozer.dagger2androidinjector.screens.main.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import me.huseyinozer.dagger2androidinjector.R;
import me.huseyinozer.dagger2androidinjector.presentation.fragments.BaseFragment;
import me.huseyinozer.dagger2androidinjector.screens.main.models.UserModel;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

public class UserInfoFragment extends BaseFragment {

    private static final String TAG = "UserInfoFragment";

    @Inject
    UserModel userModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_information, container, false);

        TextView fullNameText = (TextView) view.findViewById(R.id.text_full_name);

        fullNameText.setText(String.format("%s %s", userModel.getName(), userModel.getSurname()));

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated: " + userModel.getName());
    }
}
