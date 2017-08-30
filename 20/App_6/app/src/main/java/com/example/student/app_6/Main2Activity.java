package com.example.student.app_6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button bP,bP2OK;
    RadioButton rm;
    RadioButton rw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bP = (Button)findViewById(R.id.buttonP);
        bP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent();
                in.setClass(Main2Activity.this,MainActivity.class);
                startActivity(in);
            }
        });



        bP2OK = (Button) findViewById(R.id.buttonP2OK);
        rm = (RadioButton) findViewById(R.id.radioButtonMan);
        rw = (RadioButton) findViewById(R.id.radioButtonWoman);

        bP2OK.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Toast t;
                if(rm.isChecked()){
                    t = Toast.makeText(Main2Activity.this,"男",Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER,0,0);
                    t.show();
                }else if(rw.isChecked()){
                    t = Toast.makeText(Main2Activity.this,"女",Toast.LENGTH_SHORT);
                    t.setGravity(Gravity.CENTER,0,0);
                    t.show();
                }

            }
        });



    }
}
