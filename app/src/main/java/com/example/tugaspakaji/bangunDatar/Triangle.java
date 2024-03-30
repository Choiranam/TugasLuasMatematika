package com.example.tugaspakaji.bangunDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugaspakaji.R;

public class Triangle extends AppCompatActivity {

    EditText alasTriangle;
    EditText tinggiTriangle;
    TextView hasilTriangle;
    Button triangleCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        alasTriangle = findViewById(R.id.triangle_alas);
        tinggiTriangle = findViewById(R.id.triangle_tinggi);
        hasilTriangle = findViewById(R.id.triangle_hasil);
        triangleCalculate = findViewById(R.id.triangle_calculate);

        triangleCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alasStr = alasTriangle.getText().toString();
                String tinggiStr = tinggiTriangle.getText().toString();

                if (!alasStr.isEmpty() && !tinggiStr.isEmpty()) {
                    double alas = Double.parseDouble(alasStr);
                    double tinggi = Double.parseDouble(tinggiStr);
                    double hasil = 0;
                    hasil = 0.5 * alas * tinggi;
                    hasilTriangle.setText("Hasil : " + hasil);
                } else {
                    Toast.makeText(Triangle.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}