package com.pp.nitinr.pocketpopular;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SplashScreen extends AppCompatActivity {
    private TextView tv, tv2;
    private ImageView iv;
    public static int SPLASH_TIME_OUT = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        tv = findViewById(R.id.first);
        tv2 = findViewById(R.id.second);
        iv = findViewById(R.id.logo);

        Animation transition = AnimationUtils.loadAnimation(this, R.anim.transition);
        Animation translation = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        tv.setAnimation(translation);
        tv2.setAnimation(translation);
        iv.setAnimation(transition);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(homeIntent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        }, SPLASH_TIME_OUT);
        }

    }
