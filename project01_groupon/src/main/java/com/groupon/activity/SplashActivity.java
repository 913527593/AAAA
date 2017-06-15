package com.groupon.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.groupon.R;
import com.groupon.util.SharedPreferencesUtil;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferencesUtil spu = new SharedPreferencesUtil(SplashActivity.this);
                Intent intent;
                if (true) { //spu.isFirst()
                    intent = new Intent(SplashActivity.this, GuideActivity.class);
                    spu.setFirst(false);
                } else {
                    intent = new Intent(SplashActivity.this, MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        }, 3000);

    }
}
