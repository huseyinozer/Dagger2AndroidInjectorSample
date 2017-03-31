package me.huseyinozer.dagger2androidinjector.screens.main.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import me.huseyinozer.dagger2androidinjector.R;
import me.huseyinozer.dagger2androidinjector.presentation.activities.BaseActivity;
import me.huseyinozer.dagger2androidinjector.screens.about.activities.AboutActivity;
import me.huseyinozer.dagger2androidinjector.screens.main.fragments.UserInfoFragment;
import me.huseyinozer.dagger2androidinjector.screens.main.models.MainModel;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

public class MainActivity extends BaseActivity {

    @Inject
    MainModel mainModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, mainModel.getMessage(), Toast.LENGTH_SHORT).show();

        findViewById(R.id.button_get_user_information).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .addToBackStack(UserInfoFragment.class.getCanonicalName())
                        .add(R.id.root_layout, new UserInfoFragment())
                        .commit();
            }
        });

        findViewById(R.id.button_open_about).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
            }
        });
    }
}
