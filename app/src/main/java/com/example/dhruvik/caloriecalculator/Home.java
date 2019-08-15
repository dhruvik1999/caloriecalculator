package com.example.dhruvik.caloriecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button calorieCounter,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        init();

        calorieCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,CalorieCounter.class));
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this , Result.class));
            }
        });

    }

    private void init(){
        calorieCounter = this.findViewById(R.id.calorieCounter);
        result = this.findViewById(R.id.result);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
