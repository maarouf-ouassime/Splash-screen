package com.enset.tp2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
public class SplashActivity extends /*AwesomeSplash*/  AppCompatActivity {
    TextView bonjour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(()->{
            Intent i = new Intent(SplashActivity.this,MainActivity.class);
            startActivity(i);
            finish();
        },5000);
        RunAnimation();
    }
    private void RunAnimation()
    {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.scale);
        a.reset();
        TextView tv = (TextView) findViewById(R.id.bonjour);
        tv.clearAnimation();
        tv.startAnimation(a);
    }
}
    /*@Override
    public void initSplash(ConfigSplash configSplash) {
        ActionBar actionBar = getSupportActionBar();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        configSplash.setBackgroundColor(R.color.purple_200);
        configSplash.setAnimCircularRevealDuration(3000);
        configSplash.setRevealFlagX(Flags.REVEAL_LEFT);
        configSplash.setTitleTextColor(R.color.white);
        configSplash.setRevealFlagX(Flags.REVEAL_BOTTOM);
        configSplash.setTitleSplash(String.valueOf(bonjour));
        configSplash.setTitleTextSize(25f);
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FlipInX);

    }

    @Override
    public void animationsFinished() {
        Intent i = new Intent(SplashActivity.this,MainActivity.class);
        startActivity(i);

    }*/

