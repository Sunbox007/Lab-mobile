package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Random ran = new Random();
        Button mybutton = (Button) findViewById(R.id.button);
        final TextView gene = (TextView) findViewById(R.id.output);

        mybutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                gene.setText(String.valueOf(ran.nextInt(1000)));
            }
        });
    }

}