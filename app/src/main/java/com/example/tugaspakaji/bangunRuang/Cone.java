package com.example.tugaspakaji.bangunRuang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugaspakaji.R;

public class Cone extends AppCompatActivity {

    EditText jarijariCone;
    EditText tinggiCone;
    TextView hasilCone;
    Button coneCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);

        jarijariCone = findViewById(R.id.cone_jari);
        tinggiCone = findViewById(R.id.cone_tinggi);
        hasilCone = findViewById(R.id.cone_hasil);
        coneCalculate = findViewById(R.id.cone_calculate);

        coneCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jarijariStr = jarijariCone.getText().toString();
                String tinggiStr = tinggiCone.getText().toString();

                if (!jarijariStr.isEmpty() && !tinggiStr.isEmpty()) {
                    double jari_jari = Double.parseDouble(jarijariStr);
                    double tinggi = Double.parseDouble(tinggiStr);
                    double hasil = (1.0/3.0) * 3.14159265359 * jari_jari * jari_jari * tinggi;
                    hasilCone.setText("Volume : " + hasil);
                } else {
                    Toast.makeText(Cone.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
