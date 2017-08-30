package com.example.student.app_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityPage2 extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        b = (Button) findViewById(R.id.ButtonGoHomePage_2);
        b = (Button) findViewById(R.id.ButtonGoBackPage);

    }


    public void OnClickGoHomePage(View v){

        Intent in = new Intent();
        in.setClass(ActivityPage2.this, MainActivity.class);
        startActivity(in);

    }
    public void OnClickGoPage2Money(View v){

        Intent in = new Intent();
        in.setClass(ActivityPage2.this, ActivityPage2Money.class);
        startActivity(in);

    }



}
