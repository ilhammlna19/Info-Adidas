package com.Ilham.gokilapps2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText logMasukPenggunaEditText, emailEditText, kataSandiEditText;
    private Button loginButton;
    private TextView forgotPasswordTextView;

    // Akun yang akan digunakan untuk login

    private final String correctUsername = "ilham";
    private final String correctPassword = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Pastikan layout yang sesuai digunakan

        // Inisialisasi komponen dari XML
        logMasukPenggunaEditText = findViewById(R.id.logMasukPenggunaEditText); // Sesuai dengan ID di XML
        emailEditText = findViewById(R.id.emailEditText); // Sesuai dengan ID di XML
        kataSandiEditText = findViewById(R.id.kataSandiEditText); // Sesuai dengan ID di XML
        loginButton = findViewById(R.id.loginButton); // Sesuai dengan ID di XML
        forgotPasswordTextView = findViewById(R.id.forgotPasswordTextView); // Sesuai dengan ID di XML

        // Logika saat tombol Login diklik
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String logMasuk = logMasukPenggunaEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String kataSandi = kataSandiEditText.getText().toString();

                // Validasi username dan password
                if (logMasuk.equals(correctUsername) && kataSandi.equals(correctPassword)) {
                    Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                    // Lanjutkan ke MainActivity
                    Intent intent = new Intent(MainActivity.this, menuutama.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Username atau Password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Logika saat tombol "Lupa kata sandi" diklik
        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tampilkan pesan atau arahkan ke layar pemulihan kata sandi
                Toast.makeText(MainActivity.this, "Lupa kata sandi diklik", Toast.LENGTH_SHORT).show();

                // Alternatif: buka aktivitas pemulihan kata sandi
                // Intent intent = new Intent(Login.this, PasswordRecoveryActivity.class);
                // startActivity(intent);
            }
        });
    }
}
