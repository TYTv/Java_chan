package com.example.student.app_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        b = (Button)findViewById(R.id.buttonList);

    }

    public void onClickList(View v){
        TextView t = (TextView)findViewById(R.id.textViewList);
        t.setText("");

        RadioButton a1 = (RadioButton) findViewById(R.id.radioButtonA1);
        RadioButton a2 = (RadioButton) findViewById(R.id.radioButtonA2);
        RadioButton a3 = (RadioButton) findViewById(R.id.radioButtonA3);
        t.append("您的職業為 : ");
        if(a1.isChecked()==true){
            t.append(a1.getText());
        }else if(a2.isChecked()==true){
            t.append(a2.getText());
        }else if(a3.isChecked()==true){
            t.append(a3.getText());
        }else{
            t.append("<---請選擇職業!!");
        }
        t.append("\n");

        CheckBox b1 = (CheckBox) findViewById(R.id.checkBoxB1);
        CheckBox b2 = (CheckBox) findViewById(R.id.checkBoxB2);
        CheckBox b3 = (CheckBox) findViewById(R.id.checkBoxB3);
        t.append("您的興趣為 : ");

        if (b1.isChecked() == true) {
            t.append(b1.getText());
        }
        if (b2.isChecked() == true) {
            t.append(" "+b2.getText());
        }
        if (b3.isChecked() == true) {
            t.append(" "+b3.getText());
        }


    }


}
