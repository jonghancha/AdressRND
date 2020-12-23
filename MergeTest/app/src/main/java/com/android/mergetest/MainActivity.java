package com.android.mergetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn3;



    Button btn_2;
    Button button1;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(mClick);


        btn_2 = findViewById(R.id.btn_2);

        btn_2.setOnClickListener(btn2ClickListener);

        button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(mClickListener);

        btn4= findViewById(R.id.btn4);
        btn4.setOnClickListener(btn4ClickListener);

        btn4
    }
    View.OnClickListener btn2ClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "버튼 지은", Toast.LENGTH_SHORT).show();
        }
    };

    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn1:
                    Toast.makeText(MainActivity.this, "Button 1 Clicked", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
    View.OnClickListener btn4ClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "강후", Toast.LENGTH_SHORT).show();

        }
    };

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "버튼입니", Toast.LENGTH_SHORT).show();
        }
    };

}