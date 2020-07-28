package com.example.ms2;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

  private static int SPLASH_TIME_OUT = 3000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    startActivity(new Intent(MainActivity.this, Register.class));

                }
            }, SPLASH_TIME_OUT);
            MainActivity.this.finish();















    }
}