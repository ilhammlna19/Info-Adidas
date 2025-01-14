package com.Ilham.gokilapps2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class adidus3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidus3);

        // Tombol Pesan
        Button orderButton = findViewById(R.id.orderButton);
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Nomor WhatsApp tujuan
                String phoneNumber = "+62 8998385252";
                // Pesan otomatis
                String message = "Halo, saya tertarik dengan sepatu futsal Adidus3. Bisa dibantu untuk pemesanan?";

                // URL intent untuk WhatsApp
                String url = "https://wa.me/" + phoneNumber + "?text=" + Uri.encode(message);

                // Membuka WhatsApp
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
