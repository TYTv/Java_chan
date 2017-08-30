package com.example.student.app_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.intentButton);
    }

    public void intentOnClick(View v){
        android.content.Intent in = new android.content.Intent();
        in.setClass( MainActivity.this, IntentActivity.class );
        startActivity( in );
    }

}
