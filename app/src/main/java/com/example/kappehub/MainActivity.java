package com.example.kappehub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 4000;
    ArrayList<CafeModel> cafeModels = new ArrayList<>();
    int[] cafeImages ={R.drawable.ic_baseline_boy_24, R.drawable.ic_baseline_coffee_24,R.drawable.ic_baseline_currency_exchange_24};

    //Variables
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView topLine, bottomLine, slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setUpCafeModel();

        Cafe_RecyclerViewAdapter adapter = new Cafe_RecyclerViewAdapter(this, cafeModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpCafeModel(){
        String[] cafeNames = getResources().getStringArray(R.array.cafe_name);
        String[] time = getResources().getStringArray(R.array.time);
        String[] rating = getResources().getStringArray(R.array.rating);

        for(int i = 0; i <cafeNames.length; i++){
            cafeModels.add(new CafeModel(cafeNames[i],time[i],rating[i],cafeImages[i]));
        }
    }

//        //Animations
//        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_anim);
//        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
//
//        //Hooks
//        image = findViewById(R.id.logo);
//        topLine = findViewById(R.id.topLogoLine);
//        bottomLine = findViewById(R.id.bottomLogoLine);
//        slogan = findViewById(R.id.slogan);
//
//        image.setAnimation(topAnim);
//        topLine.setAnimation(bottomAnim);
//        bottomLine.setAnimation(bottomAnim);
//        bottomLine.setAnimation(bottomAnim);
//        slogan.setAnimation(bottomAnim);
//
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(MainActivity.this,Login.class);
//                startActivity(intent);
//                finish();
//            }
//        }, SPLASH_SCREEN);
//    }
    }

