package com.example.dhruvik.caloriecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class FlashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_screen);

        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(FlashScreen.this,"Somthing went wrong",Toast.LENGTH_LONG).show();
        }finally {
            startActivity(new Intent(this , Home.class));
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
