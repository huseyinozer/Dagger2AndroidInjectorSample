package me.huseyinozer.dagger2androidinjector.screens.main.models;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

public class MainModel {

    private final String message;

    public MainModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
