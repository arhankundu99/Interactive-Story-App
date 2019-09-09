package com.treehouse.mystoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private Button startJourney;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName=findViewById(R.id.userName);
        startJourney=findViewById(R.id.startJourney);

        startJourney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=userName.getText().toString();
                //if(name.equals(""))Toast.makeText(MainActivity.this,"Please Enter Your Name",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,storyActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        userName.setText("");
    }
}
