package com.example.tugaspakaji.bangunDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugaspakaji.R;

public class Rhombus extends AppCompatActivity {

    EditText dg1Rhombus;
    EditText dg2Rhombus;
    TextView hasilRhombus;
    Button rhombusCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);

        dg1Rhombus = findViewById(R.id.rhombus_diagonal1);
        dg2Rhombus = findViewById(R.id.rhombus_diagonal2);
        hasilRhombus = findViewById(R.id.rhombus_hasil);
        rhombusCalculate = findViewById(R.id.rhombus_calculate);

        rhombusCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dg1Str = dg1Rhombus.getText().toString();
                String dg2Str = dg2Rhombus.getText().toString();

                if (!dg1Str.isEmpty() && !dg2Str.isEmpty()) {
                    double dg1 = Double.parseDouble(dg1Str);
                    double dg2 = Double.parseDouble(dg2Str);
                    double hasil = 0;
                    hasil = 0.5 * dg1 * dg2;
                    hasilRhombus.setText("Hasil : " + hasil);
                } else {
                    Toast.makeText(Rhombus.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}