package com.example.student.app_6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {

    Toast t;
    Button bN,bP1OK;
    CheckBox cFb,cBb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bN = (Button) findViewById(R.id.buttonN);
        bN.setOnClickListener(btn);
        bP1OK = (Button)findViewById(R.id.buttonP1OK);
        bP1OK.setOnClickListener(btn);

        cFb = (CheckBox)findViewById(R.id.checkBoxFb);
        cBb = (CheckBox)findViewById(R.id.checkBoxBb);



        t = Toast.makeText(MainActivity.this,"Init",Toast.LENGTH_SHORT);

        Timer tm = new Timer();
        TimerTask tmt = new TimerTask(){
            public void run(){
                t.show();
            }
        };

        tm.schedule( tmt, 20000, 10000 );


    }


    private Button.OnClickListener btn = new Button.OnClickListener(){
        @Override
        public void onClick(View view) {

            switch (view.getId()){
                case R.id.buttonN:
                    Intent i = new Intent();
                    i.setClass(MainActivity.this,Main2Activity.class);
                    startActivity(i);

                    t = Toast.makeText(MainActivity.this,"Next",Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.BOTTOM,0,0);
                    t.show();
                    break;
                case R.id.buttonP1OK:
                    String s = "";
                    if(cFb.isChecked()){
                        s += "<足球>";
                    }
                    if(cBb.isChecked()){
                        s += "<棒球>";
                    }
                    t = Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.BOTTOM,0,0);
                    t.show();
                    break;
                default:
                    break;
            }

        }
    };



}
