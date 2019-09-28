package com.pp.nitinr.pocketpopular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private Button b1, b2, b3, b4, b5, survey;
    private ImageView iv;
    ConstraintLayout myLayout;
    AnimationDrawable animationDrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        iv = findViewById(R.id.logo);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        survey = findViewById(R.id.calc);
        myLayout = findViewById(R.id.myLayout);



        animationDrawable = (AnimationDrawable) myLayout.getBackground();
        animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.setExitFadeDuration(10000);
        animationDrawable.start();

        Animation forone = AnimationUtils.loadAnimation(this, R.anim.b1);
        Animation fortwo = AnimationUtils.loadAnimation(this, R.anim.b2);
        Animation forthree = AnimationUtils.loadAnimation(this, R.anim.b3);
        Animation forfour = AnimationUtils.loadAnimation(this, R.anim.b4);
        Animation forfive = AnimationUtils.loadAnimation(this, R.anim.b5);
        Animation image = AnimationUtils.loadAnimation(this, R.anim.transition);

        b1.setAnimation(forone);
        b2.setAnimation(fortwo);
        b3.setAnimation(forthree);
        b4.setAnimation(forfour);
        b5.setAnimation(forfive);
        survey.setAnimation(forfive);
        iv.setAnimation(image);

        ObjectAnimator fadeOut = ObjectAnimator.ofFloat(iv, "alpha", 1f, .3f);
        fadeOut.setDuration(2500);
        ObjectAnimator fadeIn = ObjectAnimator.ofFloat(iv, "alpha", .3f, 1f);
        fadeIn.setDuration(2500);

        final AnimatorSet mAnimationSet = new AnimatorSet();

        mAnimationSet.play(fadeIn).after(fadeOut);

        mAnimationSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                mAnimationSet.start();
            }
        });

        mAnimationSet.start();



    }




    public void onClick(View v) {

            switch (v.getId()) {
                case R.id.calc:
                    Intent i0 = new Intent(MainActivity.this, CalculatorActivity.class);
                    startActivity(i0);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    break;

                case R.id.button1:

                    Intent i1 = new Intent(MainActivity.this, FirstActivity.class);
                    startActivity(i1);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    break;
                case R.id.button2:

                    Intent i2 = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(i2);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    break;
                case R.id.button3:

                    Intent i3 = new Intent(MainActivity.this, ThirdActivity.class);
                    startActivity(i3);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    break;

                case R.id.button4:

                    Intent i4 = new Intent(MainActivity.this, FourthActivity.class);
                    startActivity(i4);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    break;
                case R.id.button5:

                    Intent i5 = new Intent(MainActivity.this, FifthActivity.class);
                    startActivity(i5);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    break;
            }
        }



    public void animate(View view){
        ImageView iv = (ImageView) view;
        Drawable d = iv.getDrawable();

        if (d instanceof AnimatedVectorDrawableCompat){
            AnimatedVectorDrawableCompat avd = (AnimatedVectorDrawableCompat) d;
            avd.start();

        } else if (d instanceof AnimatedVectorDrawable){
            AnimatedVectorDrawable avd = (AnimatedVectorDrawable) d;
            avd.start();

        }

    }
}
