package com.example.kappehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registration extends AppCompatActivity {

    Button callLogin;
    Button callHomePage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        callLogin = findViewById(R.id.haveAccount);

        callLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration.this,Login.class);
                startActivity(intent);
            }
        });

        callHomePage = findViewById(R.id.reg_confirm);
        callHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration.this,Home.class);
                startActivity(intent);
            }
        });
    }
}