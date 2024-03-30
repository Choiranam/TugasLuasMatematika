package com.example.tugaspakaji.bangunRuang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugaspakaji.R;

public class HexagonalPrism extends AppCompatActivity {

    EditText sisiAlas;
    EditText tinggi;
    TextView hasil;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexagonal_prism);

        sisiAlas = findViewById(R.id.hexagonal_prism_sisi_alas);
        tinggi = findViewById(R.id.hexagonal_prism_tinggi);
        hasil = findViewById(R.id.hexagonal_prism_hasil);
        calculate = findViewById(R.id.hexagonal_prism_calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sisiAlasStr = sisiAlas.getText().toString();
                String tinggiStr = tinggi.getText().toString();

                if (!sisiAlasStr.isEmpty() && !tinggiStr.isEmpty()) {
                    double sisiAlas = Double.parseDouble(sisiAlasStr);
                    double tinggiPrisma = Double.parseDouble(tinggiStr);
                    double volume = 0;

                    // Rumus volume prisma segienam
                    volume = (3 * Math.sqrt(3) / 2) * sisiAlas * sisiAlas * tinggiPrisma;

                    hasil.setText("Volume : " + volume);
                } else {
                    Toast.makeText(HexagonalPrism.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
