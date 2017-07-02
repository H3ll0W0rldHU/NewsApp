package com.example.android.newsapp;

public class Story {

    private String mTitle;

    private String mSection;

    private String mUrl;


    public Story(String title, String section, String url) {
        mTitle = title;
        mSection = section;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getUrl() {
        return mUrl;
    }
}
