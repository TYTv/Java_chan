package com.example.student.app_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityPage2CheckBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2_checkbox);
    }


    public void OnClickGoBackPage(View v){
        Intent in = new Intent();
        in.setClass(ActivityPage2CheckBox.this, ActivityPage2.class);
        startActivity(in);
    }

}
