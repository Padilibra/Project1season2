package com.example.project1season2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private int currentNumber = 0; // Variabel untuk menyimpan angka saat ini
    private TextView numberTextView; // Referensi ke TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        numberTextView = findViewById(R.id.textview);
        Button addButton = findViewById(R.id.tombol3);
        Button subtractButton = findViewById(R.id.tombol4);
        Button resetButton = findViewById(R.id.tombol2);
        Button homeButton = findViewById(R.id.tombol1);

        addButton.setOnClickListener(v -> {
            addNumber(); // Memanggil metode untuk menambah angka
        });

        subtractButton.setOnClickListener(v -> {
            subtractNumber(); // Memanggil metode untuk mengurangi angka
        });

        resetButton.setOnClickListener(v -> {
            resetNumber(); // Memanggil metode untuk mereset angka
        });

        homeButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);
        });
    }

    private void addNumber() {
        currentNumber++; // Menambah angka
        numberTextView.setText(String.valueOf(currentNumber)); // Memperbarui TextView
    }

    private void subtractNumber() {
        currentNumber--; // Mengurangi angka
        numberTextView.setText(String.valueOf(currentNumber)); // Memperbarui TextView
    }

    private void resetNumber() {
        currentNumber = 0; // Mengatur angka kembali ke nol
        numberTextView.setText(String.valueOf(currentNumber)); // Memperbarui TextView
    }
}