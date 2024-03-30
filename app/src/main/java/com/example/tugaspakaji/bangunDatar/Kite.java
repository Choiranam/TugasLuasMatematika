package com.example.tugaspakaji.bangunDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugaspakaji.R;

public class Kite extends AppCompatActivity {

    EditText dg1Kite;
    EditText dg2Kite;
    TextView hasilKite;
    Button kiteCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kite);

        dg1Kite = findViewById(R.id.kite_diagonal1);
        dg2Kite = findViewById(R.id.kite_diagonal2);
        hasilKite = findViewById(R.id.kite_hasil);
        kiteCalculate = findViewById(R.id.kite_calculate);

        kiteCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dg1Str = dg1Kite.getText().toString();
                String dg2Str = dg2Kite.getText().toString();

                if (!dg1Str.isEmpty() && !dg2Str.isEmpty()) {
                    double dg1 = Double.parseDouble(dg1Str);
                    double dg2 = Double.parseDouble(dg2Str);
                    double hasil = 0;
                    hasil = 0.5 * dg1 * dg2;
                    hasilKite.setText("Hasil : " + hasil);
                } else {
                    Toast.makeText(Kite.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
