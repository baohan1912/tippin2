package com.example.han_ttb_ttv.tippin2.views.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.han_ttb_ttv.tippin2.R;
import com.example.han_ttb_ttv.tippin2.views.Top.TopActivity;

/**
 * Created by han-ttb-ttv on 5/15/2018.
 */

public class Splash extends AppCompatActivity {
    final int DELAYDURATION = 2500;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.actitvity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this,TopActivity.class);
                startActivity(intent);
                finish();
            }
        },DELAYDURATION);
    }
}
