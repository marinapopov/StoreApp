package com.barbaracollection.barbaracollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.barbaracollection.barbaracollection.ui.login.LoginActivity;

public class HomeActivity extends AppCompatActivity {

    Button clothingBtn;
    ImageButton bagBtn;
    ImageButton favoriteBtn;
    ImageButton accBtn;
    Button shoesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        clothingBtn = findViewById(R.id.button2);
        bagBtn = findViewById(R.id.imageButton8);
        favoriteBtn = findViewById(R.id.imageButton9);
        accBtn = findViewById(R.id.imageButton10);
        shoesBtn = findViewById(R.id.button3);

        clothingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ClothingActivity.class);
                startActivity(intent);
            }
        });

        bagBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, BagActivity.class);
                startActivity(intent);
            }
        });

        favoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SavedItems.class);
                startActivity(intent);
            }
        });

        accBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });

        shoesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ShoesActivity.class);
                startActivity(intent);
            }
        });
    }
}