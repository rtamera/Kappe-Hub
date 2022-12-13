package com.example.kappehub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Home extends AppCompatActivity implements RecyclerViewInterface {
    ArrayList<CafeModel> cafeModels = new ArrayList<>();
    int[] cafeImages ={R.drawable.mr__white_cafe, R.drawable.cafe_krema_nero, R.drawable.flower_cafe,R.drawable.foam_coffee, R.drawable.seollem_cafe};
    Button earnPoints;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setUpCafeModel();

        Cafe_RecyclerViewAdapter adapter = new Cafe_RecyclerViewAdapter(this, cafeModels,  this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        earnPoints = findViewById(R.id.earn_points_btn);
        earnPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, QRScanner.class);
                startActivity(intent);
            }
        });
    }

    private void setUpCafeModel(){
        String[] cafeNames = getResources().getStringArray(R.array.cafe_name);
        String[] time = getResources().getStringArray(R.array.time);
        String[] rating = getResources().getStringArray(R.array.rating);
        String[] description = getResources().getStringArray(R.array.description);
        String[] location = getResources().getStringArray(R.array.location);

        for(int i = 0; i <cafeNames.length; i++){
            cafeModels.add(new CafeModel(cafeNames[i],time[i],rating[i],cafeImages[i], description[i], location[i]));
        }
    }


    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(Home.this, CoffeeShopDetails.class);
        intent.putExtra("NAME", cafeModels.get(position).getCafeName());
        intent.putExtra("IMAGE", cafeModels.get(position).getImage());
        intent.putExtra("DESCRIPTION", cafeModels.get(position).getDescription());
        intent.putExtra("LOCATION", cafeModels.get(position).getLocation());
        startActivity(intent);
    }
}