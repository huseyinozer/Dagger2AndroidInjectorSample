package me.huseyinozer.dagger2androidinjector.screens.main.models;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

public class UserModel {
    private String name;
    private String surname;

    public UserModel(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
