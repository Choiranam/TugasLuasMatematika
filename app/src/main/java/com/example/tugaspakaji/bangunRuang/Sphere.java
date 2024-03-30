package com.example.tugaspakaji.bangunRuang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugaspakaji.R;

public class Sphere extends AppCompatActivity {

    EditText jariJari;
    TextView hasil;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        jariJari = findViewById(R.id.sphere_jari_jari);
        hasil = findViewById(R.id.sphere_hasil);
        calculate = findViewById(R.id.sphere_calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jariJariStr = jariJari.getText().toString();

                if (!jariJariStr.isEmpty()) {
                    double jariJariBola = Double.parseDouble(jariJariStr);
                    double volume = 0;

                    // Rumus volume bola
                    volume = (4.0 / 3.0) * 3.14159265359 * jariJariBola * jariJariBola * jariJariBola;

                    hasil.setText("Volume : " + volume);
                } else {
                    Toast.makeText(Sphere.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
