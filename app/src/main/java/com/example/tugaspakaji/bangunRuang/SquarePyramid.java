package com.example.tugaspakaji.bangunRuang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugaspakaji.R;

public class SquarePyramid extends AppCompatActivity {

    EditText sisiAlas;
    EditText tinggi;
    TextView hasil;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_pyramid);

        sisiAlas = findViewById(R.id.square_pyramid_sisi_alas);
        tinggi = findViewById(R.id.square_pyramid_tinggi);
        hasil = findViewById(R.id.square_pyramid_hasil);
        calculate = findViewById(R.id.square_pyramid_calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sisiAlasStr = sisiAlas.getText().toString();
                String tinggiStr = tinggi.getText().toString();

                if (!sisiAlasStr.isEmpty() && !tinggiStr.isEmpty()) {
                    double sisiAlas = Double.parseDouble(sisiAlasStr);
                    double tinggiLim = Double.parseDouble(tinggiStr);
                    double volume = 0;

                    // Rumus volume limas segiempat
                    volume = (1.0/3) * sisiAlas * sisiAlas * tinggiLim;

                    hasil.setText("Volume : " + volume);
                } else {
                    Toast.makeText(SquarePyramid.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
