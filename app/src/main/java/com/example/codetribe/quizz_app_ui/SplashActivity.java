package com.example.codetribe.quizz_app_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.view.animation.RotateAnimation;


public class SplashActivity extends AppCompatActivity {
    RotateAnimation rotateAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        ImageView SplashImg = (ImageView)findViewById(R.id.img_splash);
//       rotateAnimation =new RotateAnimation(0f,360f);
//        rotateAnimation.setDuration(3000);
//        SplashImg.startAnimation(rotateAnimation);

        RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(3000);
        rotate.setInterpolator(new LinearInterpolator());
        ImageView SplashImg = (ImageView)findViewById(R.id.img_splash);
        SplashImg.startAnimation(rotate);
    }
}
