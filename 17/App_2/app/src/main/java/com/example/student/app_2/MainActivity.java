package com.example.student.app_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.ButtonGoPage1);
        b = (Button) findViewById(R.id.ButtonGoPage2);
    }

    public void OnClickGoPage1(View v){
        Intent in;
        in = new Intent();
        in.setClass(MainActivity.this,ActivityPage1.class);

        startActivity(in);

    }

    public void OnClickGoPage2(View v){
        Intent in;
        in = new Intent();
        in.setClass(MainActivity.this,ActivityPage2.class);

        startActivity(in);

    }

}
