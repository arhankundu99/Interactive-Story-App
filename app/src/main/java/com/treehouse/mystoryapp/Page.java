package com.treehouse.mystoryapp;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Page {
    int pageImageViewId;
    int storyTextViewId;
    Choice choice1,choice2;

    public Page(int pageImageViewId, int storyTextViewId) {
        this.pageImageViewId = pageImageViewId;
        this.storyTextViewId = storyTextViewId;
    }

    public int getPageImageViewId() {

        return pageImageViewId;
    }

    public int getStoryTextViewId() {
        return storyTextViewId;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public Page(int pageImageViewId, int storyTextViewId, Choice choice1, Choice choice2) {

        this.pageImageViewId = pageImageViewId;
        this.storyTextViewId = storyTextViewId;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }
}
