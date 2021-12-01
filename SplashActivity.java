package com.example.avjindersinghsekhon.minimaltodo.Main;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.avjindersinghsekhon.minimaltodo.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Timer RunSplash = new Timer();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        TimerTask ShowSplash = new TimerTask() {
            @Override
            public void run() {





                        Intent intent2 = new Intent(SplashActivity.this, MainActivity.class);
                        startActivity(intent2);
                        finish();


                }







        };
        // Start the timer
        RunSplash.schedule(ShowSplash, 3000);
    }

}