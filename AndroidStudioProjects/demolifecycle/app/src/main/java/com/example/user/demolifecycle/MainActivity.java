package com.example.user.demolifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> ar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lvdemo);
        ar=new ArrayList<>();
        ar.add("Hưng");
        ar.add("Đẹp");
        ar.add("V~");
        ar.add("L");

        ArrayAdapter aa = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,ar);

        lv.setAdapter(aa);


    }

}
