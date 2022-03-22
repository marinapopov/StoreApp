package com.barbaracollection.barbaracollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BagActivity extends AppCompatActivity {

    ImageButton returnBtn;
    ImageButton favoriteBtn;
    ImageButton homeBtn;
    Button checkoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag);

        returnBtn = findViewById(R.id.imageButton14);
        favoriteBtn = findViewById(R.id.imageButton19);
        homeBtn = findViewById(R.id.imageButton17);
        checkoutBtn = findViewById(R.id.button10);

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        favoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BagActivity.this, SavedItems.class);
                startActivity(intent);
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BagActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        checkoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BagActivity.this, OrderDone.class);
                startActivity(intent);
            }
        });
    }
}