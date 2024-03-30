package com.example.tugaspakaji.bangunRuang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugaspakaji.R;

public class Cylinder extends AppCompatActivity {

    EditText jariJari;
    EditText tinggi;
    TextView hasil;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        jariJari = findViewById(R.id.cylinder_jari_jari);
        tinggi = findViewById(R.id.cylinder_tinggi);
        hasil = findViewById(R.id.cylinder_hasil);
        calculate = findViewById(R.id.cylinder_calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jariJariStr = jariJari.getText().toString();
                String tinggiStr = tinggi.getText().toString();

                if (!jariJariStr.isEmpty() && !tinggiStr.isEmpty()) {
                    double jariJariTabung = Double.parseDouble(jariJariStr);
                    double tinggiTabung = Double.parseDouble(tinggiStr);
                    double volume = 0;

                    // Rumus volume tabung
                    volume = 3.14159265359 * jariJariTabung * jariJariTabung * tinggiTabung;

                    hasil.setText("Volume : " + volume);
                } else {
                    Toast.makeText(Cylinder.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
