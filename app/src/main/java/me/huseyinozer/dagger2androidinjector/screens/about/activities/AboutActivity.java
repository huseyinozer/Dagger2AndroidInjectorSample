package me.huseyinozer.dagger2androidinjector.screens.about.activities;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import me.huseyinozer.dagger2androidinjector.R;
import me.huseyinozer.dagger2androidinjector.presentation.activities.BaseActivity;
import me.huseyinozer.dagger2androidinjector.screens.about.models.AboutModel;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

public class AboutActivity extends BaseActivity {

    @Inject
    AboutModel about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView authorText = (TextView) findViewById(R.id.text_author);
        TextView contentText = (TextView) findViewById(R.id.text_content);

        authorText.setText(about.getAuthor());
        contentText.setText(about.getContent());
    }

}
