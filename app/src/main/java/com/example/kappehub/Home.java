package com.example.kappehub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    ArrayList<CafeModel> cafeModels = new ArrayList<>();
    int[] cafeImages ={R.drawable.ic_baseline_boy_24, R.drawable.ic_baseline_coffee_24,R.drawable.ic_baseline_currency_exchange_24};

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
}