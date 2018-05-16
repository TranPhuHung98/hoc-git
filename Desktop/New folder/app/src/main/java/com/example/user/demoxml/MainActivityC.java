package com.example.user.demoxml;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityC extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityc);
        TextView tv1= findViewById(R.id.TV1);
        TextView tv2= findViewById(R.id.TV2);
        TextView tv3= findViewById(R.id.TV3);
        TextView tv4= findViewById(R.id.TV4);
        TextView tv5= findViewById(R.id.TV5);
        TextView tv6= findViewById(R.id.TV6);
        TextView tv7= findViewById(R.id.TV7);
        Button bttb = findViewById(R.id.bttb);
        bttb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityC.this,MainActivityD.class);
                startActivity(intent);
            }
        });
    }
}
