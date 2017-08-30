package com.example.student.app_7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t;
    private ListView l;
//    String[] Fruits = new String[] {"尺","筆","書","圓規"};
//    int[] Price = new int[] {330,120,250,280};
    int[] Price = new int[] {330,120,250,280,437,789};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = (TextView) findViewById(R.id.textView);
        l = (ListView) findViewById(R.id.listView);

//        ArrayAdapter<String> adapterBalls = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Fruits);
        ArrayAdapter<CharSequence> adapterBalls = ArrayAdapter.createFromResource(this,R.array.valstr,android.R.layout.simple_list_item_1);


        l.setAdapter(adapterBalls);
        l.setOnItemClickListener(LL);


    }

    private ListView.OnItemClickListener LL = new ListView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String sel=adapterView.getItemAtPosition(i).toString();
            t.setText(sel + " " + Price[i] + " ");
        }
    };

}
