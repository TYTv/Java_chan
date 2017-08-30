package com.example.student.app_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button)findViewById(R.id.buttonCal);
        b = (Button)findViewById(R.id.buttonNext);

    }


    public void onClickCal(View v) {

        try{
            TextView a;
            int ans = 0;

            int ruler = Integer.parseInt( ((TextView)findViewById(R.id.editTextRuler)).getText().toString() );
            ans += ruler*29;

            int pan = Integer.parseInt( ((TextView)findViewById(R.id.editTextPan)).getText().toString() );
            ans += pan*31;

            CheckBox paper = (CheckBox) findViewById(R.id.checkBoxPaper);
            CheckBox compasses = (CheckBox) findViewById(R.id.checkBoxCompasses);
            CheckBox note = (CheckBox) findViewById(R.id.checkBoxNote);

            if( paper.isChecked() == true ) {
                ans += 30;
            }
            if( compasses.isChecked() == true ) {
                ans += 60;
            }
            if( note.isChecked() == true ) {
                ans += 60;
            }

            ((TextView) findViewById(R.id.textViewAns)).setText( Integer.toString(ans) );

        }catch (NumberFormatException e){
            ((TextView) findViewById(R.id.editTextRuler)).setText("");
            ((TextView) findViewById(R.id.editTextPan)).setText("");
            ((TextView) findViewById(R.id.textViewAns)).setText("輸入錯誤");
        }
    }

    public void onClickNext(View v) {
        Intent in = new Intent();
        in.setClass(MainActivity.this, NextActivity.class);
        startActivity(in);
    }

}
