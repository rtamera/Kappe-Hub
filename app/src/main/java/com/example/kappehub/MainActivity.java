package com.example.kappehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 4000;

    //Variables
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView topLine, bottomLine, slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animations
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        //Hooks
        image = findViewById(R.id.logo);
        topLine = findViewById(R.id.topLogoLine);
        bottomLine = findViewById(R.id.bottomLogoLine);
        slogan = findViewById(R.id.slogan);

        image.setAnimation(topAnim);
        topLine.setAnimation(bottomAnim);
        bottomLine.setAnimation(bottomAnim);
        bottomLine.setAnimation(bottomAnim);
        slogan.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Login.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);
    }


}