package com.example.user.firstapp042718;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lvMonhoc;
    Button btnThem;
    EditText edtMonHoc;
    ArrayList<String> arrayCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonhoc = (ListView)findViewById(R.id.listviewMonhoc);
        btnThem = (Button)findViewById(R.id.buttonThem);
        edtMonHoc= (EditText)findViewById(R.id.editTextMonhoc);
        arrayCourse = new ArrayList<>();

        arrayCourse.add("ABC");
        arrayCourse.add("DEF");
        arrayCourse.add("Dục");
        arrayCourse.add("Chọt");
        arrayCourse.add("Phọt");
        arrayCourse.add("Ọt");

        final ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayCourse);

        lvMonhoc.setAdapter(adapter);
        lvMonhoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //position trả về vị trí click trên lv, nhấn cái đầu = 0 , nhấn cái tiếp theo ++
                Toast.makeText(MainActivity.this, arrayCourse.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        lvMonhoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,"Long click: "+ arrayCourse.get(position), Toast.LENGTH_SHORT).show();

                return false;
            }
        });

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mon = edtMonHoc.getText().toString();
                arrayCourse.add(mon);
                adapter.notifyDataSetChanged();
            }
        });

    }

}
