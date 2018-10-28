package com.example.manish.notes;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {

    private static int splashtime=1500;
    @Override
    protected void onCreate(@Nullable Bundle savedInstnceState) {

        super.onCreate(savedInstnceState);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },splashtime);
    }
}
