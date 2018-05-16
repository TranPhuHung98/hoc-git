package com.example.user.demoxml;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityD extends AppCompatActivity {
    TextView textView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityd);
        textView = findViewById(R.id.tvr);
        Button button = findViewById(R.id.btr);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivityD.class);
                startActivity(intent);
                Intent startMainD = new Intent(Intent.ACTION_MAIN);
                startMainD.addCategory(Intent.CATEGORY_HOME);
                startActivity(startMainD);
                finish();
            }
        });
    }
}
