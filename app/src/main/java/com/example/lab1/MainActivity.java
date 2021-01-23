package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = 50;
        TextView t = (TextView) findViewById(R.id.outputField);
        t.setText(counter.toString());
    }

    public void onClickInputButtonInc(View v) {
        TextView t = (TextView) findViewById(R.id.outputField);
        counter++;
        t.setText(counter.toString());
    }

    public void onClickInputButtonDec(View v) {
        TextView t = (TextView) findViewById(R.id.outputField);
        counter--;
        t.setText(counter.toString());
    }
}