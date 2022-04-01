package com.barbaracollection.barbaracollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.barbaracollection.barbaracollection.ui.login.LoginActivity;

public class SignOutActivity extends AppCompatActivity {

    Button loginBtn;
    Button homeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_out);

        loginBtn = findViewById(R.id.button12);
        homeBtn = findViewById(R.id.button13);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignOutActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignOutActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}