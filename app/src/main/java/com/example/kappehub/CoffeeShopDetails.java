package com.example.kappehub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CoffeeShopDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_shop_details);

        String name = getIntent().getStringExtra("NAME");
        String description = getIntent().getStringExtra("DESCRIPTION");
        int image = getIntent().getIntExtra("IMAGE", 0);
        String location = getIntent().getStringExtra("LOCATION");

        TextView nameTextView = findViewById(R.id.detail_name);
        ImageView logoImageView = findViewById(R.id.detail_logo);
        TextView descTextView = findViewById(R.id.detail_description);
        TextView locTextView = findViewById(R.id.detail_location);

        nameTextView.setText(name);
        logoImageView.setImageResource(image);
        descTextView.setText(description);
        locTextView.setText(location);
    }
}