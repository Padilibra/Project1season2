package com.example.project1season2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    private TextView randomNumberTextView;
    private Button generateButton;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        randomNumberTextView = findViewById(R.id.generatetextview);
        generateButton = findViewById(R.id.generateButton);
        random = new Random();

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumber = random.nextInt(100); // Menghasilkan angka acak antara 0 dan 99
                randomNumberTextView.setText(String.valueOf(randomNumber));
            }
        });
    }
}
