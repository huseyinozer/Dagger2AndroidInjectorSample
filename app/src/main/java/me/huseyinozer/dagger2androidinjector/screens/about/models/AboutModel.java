package me.huseyinozer.dagger2androidinjector.screens.about.models;

/**
 * Created by Huseyin Ozer on 29.3.2017.
 */

public class AboutModel {

    private String author;

    private String content;

    public AboutModel(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
