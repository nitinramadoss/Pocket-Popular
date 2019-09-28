package com.pp.nitinr.pocketpopular;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }

    public void example(View view){
        ImageView iv = (ImageView) view;
        Drawable d = iv.getDrawable();

        Intent i = new Intent(FifthActivity.this, PopFive.class);
        startActivity(i);

        if (d instanceof Animatable){
            ((Animatable) d).start();
        }



    }

    public void animate(View view){
        ImageView iv = (ImageView) view;
        Drawable d = iv.getDrawable();
        FifthActivity.this.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        if (d instanceof AnimatedVectorDrawableCompat){
            AnimatedVectorDrawableCompat avd = (AnimatedVectorDrawableCompat) d;
            avd.start();


        } else if (d instanceof AnimatedVectorDrawable){
            AnimatedVectorDrawable avd = (AnimatedVectorDrawable) d;
            avd.start();


        }

    }
}
