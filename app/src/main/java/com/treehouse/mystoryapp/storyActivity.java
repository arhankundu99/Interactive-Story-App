package com.treehouse.mystoryapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Stack;

public class storyActivity extends AppCompatActivity {

    private ImageView storyImageView;
    private TextView storyTextView;
    private Button choice1;
    private Button choice2;
    private Story story;
    private Stack<Integer> pageStack=new Stack<>();

    private int pageNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        story=new Story();

        pageNumber=0;


        loadPage(pageNumber);
    }
    public void loadPage(int pageNumber)
    {
        storyImageView=findViewById(R.id.storyImageView);
        storyTextView=findViewById(R.id.storyText);
        choice1=findViewById(R.id.choice1);
        choice2=findViewById(R.id.choice2);

        pageStack.push(pageNumber);
        final Page page=story.getPage(pageNumber);

        if(pageNumber==5||pageNumber==6){
            Drawable storyImage=ContextCompat.getDrawable(storyActivity.this,page.getPageImageViewId());
            storyImageView.setImageDrawable(storyImage);

            storyTextView.setText(page.storyTextViewId);
            choice1.setVisibility(View.GONE);

            choice2.setText(R.string.play_again_button_text);
            choice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

        }
        else {

            choice1.setVisibility(View.VISIBLE);
            Drawable storyImage = ContextCompat.getDrawable(storyActivity.this, page.getPageImageViewId());
            storyImageView.setImageDrawable(storyImage);

            storyTextView.setText(page.storyTextViewId);
            choice1 = findViewById(R.id.choice1);
            choice2 = findViewById(R.id.choice2);

            choice1.setText(page.choice1.getChoiceTextId());
            choice2.setText(page.choice2.getChoiceTextId());

            choice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = page.choice1.getNextPage();
                    loadPage(nextPage);
                }
            });
            choice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = page.choice2.getNextPage();
                    loadPage(nextPage);
                }
            });
        }
    }

    @Override
    public void onBackPressed() {

        pageStack.pop();
        if(!pageStack.isEmpty())loadPage(pageStack.pop());
        else super.onBackPressed();
    }
}
