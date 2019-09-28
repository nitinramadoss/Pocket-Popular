package com.pp.nitinr.pocketpopular;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.widget.ImageView;

import android.widget.Toast;



public class CalculatorActivity extends AppCompatActivity {


    int valueOne = 1;
    int valueTwo = 5;
    int valueThree = 10;

    int count = 0;
    int totalClicks = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


    }


    public void survey(View v){

        switch(v.getId()) {
            case  R.id.rB1:
                count += valueOne;
                totalClicks++;
                break;

            case  R.id.rB2:
                count += valueTwo;
                totalClicks++;
                break;
            case R.id.rB3:
                count += valueThree;
                totalClicks++;
                break;
            case  R.id.rB4:
                count += valueOne;
                totalClicks++;
                break;

            case  R.id.rB5:
                count += valueTwo;
                totalClicks++;
                break;
            case R.id.rB6:
                count += valueThree;
                totalClicks++;
                break;
            case  R.id.rB7:
                count += valueOne;
                totalClicks++;
                break;

            case  R.id.rB8:
                count += valueTwo;
                totalClicks++;
                break;
            case R.id.rB9:
                count += valueThree;
                totalClicks++;
                break;

            case  R.id.rB10:
                count += valueOne;
                totalClicks++;
                break;

            case  R.id.rB11:
                count += valueTwo;
                totalClicks++;
                break;
            case R.id.rB12:
                count += valueThree;
                totalClicks++;
                break;
            case  R.id.rB13:
                count += valueOne;
                totalClicks++;
                break;

            case  R.id.rB14:
                count += valueTwo;
                totalClicks++;
                break;
            case R.id.rB15:
                count += valueThree;
                totalClicks++;
                break;
            case R.id.submit:

                double average = count/(double)totalClicks;

                if ( average <= 3.0) {
                    Toast.makeText(CalculatorActivity.this, "You are fine! There are many opportunities to boost perceived popularity!", Toast.LENGTH_LONG).show();
                } else if (average > 3.0 && average <= 7.0) {
                    Toast.makeText(CalculatorActivity.this, "You have an average level of perceived popularity! Not too high or too low... just right!", Toast.LENGTH_LONG).show();
                } else if (average > 7.0) {
                    Toast.makeText(CalculatorActivity.this, "You have a very high level of perceived popularity! Congratulations!", Toast.LENGTH_LONG).show();
                }
            }


        }

    public void animate(View view){
        ImageView iv = (ImageView) view;
        Drawable d = iv.getDrawable();
        CalculatorActivity.this.finish();
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



