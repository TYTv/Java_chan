package com.example.student.app_2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityPage1 extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        b = (Button) findViewById(R.id.ButtonGoHomePage_1);
        b = (Button) findViewById(R.id.HttpButton);
        b = (Button) findViewById(R.id.DialButton);
        b = (Button) findViewById(R.id.CaptureButton);
        b = (Button) findViewById(R.id.MapButton);
    }

    public void OnClickGoHomePage(View v){

        Intent in = new Intent();
        in.setClass(ActivityPage1.this, MainActivity.class);
        startActivity(in);

    }

    public void HttpOnClick(View v){
        Uri u = Uri.parse("http://www.google.com");
        Intent in = new Intent(Intent.ACTION_VIEW,u);
        startActivity(in);

    }
    public void DialOnClick(View v){
        Uri u = Uri.parse("tel:0919891629");
        Intent in = new Intent(Intent.ACTION_DIAL,u);
        startActivity(in);

    }
    public void CaptureOnClick(View v){
        Intent in = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(in);
    }
    public void MapOnClick(View v){
        Uri u = Uri.parse("geo:25.071176, 121.585830");
        Intent in = new Intent(Intent.ACTION_VIEW,u);
        startActivity(in);
    }

}
