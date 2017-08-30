package com.example.student.app_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import cal.company;

public class ActivityPage2Money extends AppCompatActivity {

    Button b;
    EditText p,r,y;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2_money);

        b = (Button) findViewById(R.id.ButtonGoPage2Money);
        p = (EditText) findViewById(R.id.EditTextPV);
        r = (EditText) findViewById(R.id.EditTextR);
        y = (EditText) findViewById(R.id.EditTextY);
        t = (TextView) findViewById(R.id.TextViewANS);

    }

    public void OnClickGoBackPage(View v){
        Intent in = new Intent();
        in.setClass(ActivityPage2Money.this, ActivityPage2.class);
        startActivity(in);
    }

    public void OnClickCal(View v){
        int pp = Integer.getInteger( p.getText().toString() );
        float rr = Float.parseFloat( r.getText().toString() );
        int yy = Integer.getInteger( y.getText().toString() );


        cal.company.FV(pp,rr,yy);



    }


}
