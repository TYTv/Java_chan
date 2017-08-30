package com.example.student.app_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

import cal.company;

public class MainActivity extends AppCompatActivity {

    Button p;
    Button n;
    ImageView i;
    ArrayList<Integer> im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p = (Button) findViewById(R.id.buttonP);
        n = (Button) findViewById(R.id.buttonN);
        i = (ImageView) findViewById(R.id.imageView);

        im = new ArrayList<Integer>();
        im.add(R.drawable.img01);
        im.add(R.drawable.img02);
        im.add(R.drawable.img03);
        im.add(R.drawable.img04);
        im.add(R.drawable.img05);
        im.add(R.drawable.img07);
        im.add(R.drawable.img08);

        ((View) findViewById(R.id.buttonP)).setOnClickListener(h);
        ((View) findViewById(R.id.buttonN)).setOnClickListener(h);


    }

    int x = 0;
    View.OnClickListener h = new View.OnClickListener(){
        public void onClick(View v){
            switch( v.getId() ){
                case R.id.buttonP:
                    x++;
                    if(x>=im.size()) {
                        x = 0;
                    }
                    i.setImageResource(im.get(x));
                    break;
                case R.id.buttonN:
                    x--;
                    if(x<0) {
                        x = (im.size()-1);
                    }
                    i.setImageResource(im.get(x));
                default:
                    break;
            }


        }
    };


/*
    public void onClickP(View v) {

        x++;
        if(x>=im.size()) {
            x = 0;
        }
        i.setImageResource(im.get(x));
    }

    public void onClickN(View v) {
        x--;
        if(x<0) {
            x = (im.size()-1);
        }
        i.setImageResource(im.get(x));
    }
*/

}
