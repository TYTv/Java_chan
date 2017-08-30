package com.example.student.app_7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        String[] arr = {"資訊","金融","服務"};
        ArrayAdapter<String> arradp = new ArrayAdapter<>( this, android.R.layout.simple_spinner_item, arr );
*/
/*
        ArrayAdapter<String> arradp = new ArrayAdapter<>( this, android.R.layout.simple_spinner_item );
        arradp.add("資訊");
        arradp.add("金融");
        arradp.add("服務");
*/
        ArrayAdapter<CharSequence> arradp = ArrayAdapter.createFromResource( this, R.array.strarr, android.R.layout.simple_spinner_dropdown_item);

        arradp.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );

        Spinner spn = (Spinner)findViewById( R.id.spinner );
        spn.setAdapter( arradp );

        spn.setOnItemSelectedListener(sel);

    }

    private Spinner.OnItemSelectedListener sel = new Spinner.OnItemSelectedListener(){

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            String s = adapterView.getSelectedItem().toString();

            Toast t = Toast.makeText( MainActivity.this, s, Toast.LENGTH_SHORT );
            t.setGravity(Gravity.BOTTOM,0,0);
            t.show();

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }

    };


}
