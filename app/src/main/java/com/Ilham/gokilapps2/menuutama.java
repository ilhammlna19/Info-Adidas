package com.Ilham.gokilapps2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class menuutama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutama); // Pastikan sesuai dengan file XML Anda

        // Gambar 1
        ImageView image1 = findViewById(R.id.image1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuutama.this, adidus1.class);
                startActivity(intent);
            }
        });

        // Gambar 2
        ImageView image2 = findViewById(R.id.image2);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuutama.this, adidus2.class);
                startActivity(intent);
            }
        });

        // Gambar 3
        ImageView image3 = findViewById(R.id.image3);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuutama.this, adidus3.class);
                startActivity(intent);
            }
        });

        // Gambar 4
        ImageView image4 = findViewById(R.id.image4);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menuutama.this, adidus2.class);
                startActivity(intent);
            }
        });
    }
}
