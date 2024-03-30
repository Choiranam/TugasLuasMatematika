package com.example.tugaspakaji.bangunDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugaspakaji.R;

public class Circle extends AppCompatActivity {

    EditText jarijariCircle;
    TextView hasilCircle;
    Button circleCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        jarijariCircle = findViewById(R.id.circle_jari);
        hasilCircle = findViewById(R.id.circle_hasil);
        circleCalculate = findViewById(R.id.circle_calculate);

        circleCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jarijariStr = jarijariCircle.getText().toString();

                if (!jarijariStr.isEmpty()) {
                    double jari_jari = Double.parseDouble(jarijariStr);
                    double hasil = 0;
                    hasil = 3.14159265359 * jari_jari * jari_jari;
                    hasilCircle.setText("Hasil : " + hasil);
                } else {
                    Toast.makeText(Circle.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}