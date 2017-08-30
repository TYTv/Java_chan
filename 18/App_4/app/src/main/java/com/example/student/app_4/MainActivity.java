package com.example.student.app_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.buttonCal);

    }

    public double FF(double dat){
        return( (Math.round(dat*100.0))/100.0 );
    }

    public void onClickCal(View v){

        try {

            EditText ed = (EditText) findViewById(R.id.editTextHeight);
            Float h = Float.parseFloat(ed.getText().toString());
            EditText w = (EditText) findViewById(R.id.editTextWeight);
            EditText wr = (EditText) findViewById(R.id.editTextWeightRange);

            if( (h>250) || (h<100) ){
                String s = "請輸入人類合理身高範圍!!(100~250cm)";
                Toast t = Toast.makeText( MainActivity.this, s, Toast.LENGTH_SHORT );
                t.setGravity(Gravity.CENTER,0,0);
                t.show();
                return;
            }


            double tmp;
            if (((RadioButton) findViewById(R.id.radioButtonMan)).isChecked() == true) {

                tmp = (h - 80) * 0.7;

            } else if (((RadioButton) findViewById(R.id.radioButtonWoman)).isChecked() == true) {

                tmp = (h - 70) * 0.6;

            } else {

                String s = "請選擇性別!!";
                Toast t = Toast.makeText( MainActivity.this, s, Toast.LENGTH_SHORT );
                t.setGravity(Gravity.CENTER,0,0);
                t.show();
                return;

            }
            w.setText( FF(tmp) + "kg" );
            wr.setText( FF(tmp * 0.9) + " ~ " + FF(tmp * 1.1) + "kg");





        }catch (Exception e){

        }
    }



}
