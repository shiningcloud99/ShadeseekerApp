package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button signupButton = findViewById(R.id.signupButton);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil metode untuk menuju ke MainActivity di sini
                goToMainActivity();
            }
        });

        TextView signupText = findViewById(R.id.signupText);
        signupText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil metode untuk menuju ke MainActivity di sini
                goToMainActivity();
            }
        });
    }

    // Metode untuk menuju ke MainActivity
    private void goToMainActivity() {
        Intent intent = new Intent(MainActivity4.this, MainActivity.class);
        startActivity(intent);
        // Tambahkan finish() jika Anda ingin menutup MainActivity4 setelah berpindah ke MainActivity
        // finish();
    }
}
