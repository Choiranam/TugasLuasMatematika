package com.example.tugaspakaji.bangunRuang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugaspakaji.R;

public class Cube extends AppCompatActivity {

    EditText sisiCube;
    TextView hasilCube;
    Button cubeCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        sisiCube = findViewById(R.id.cube_sisi);
        hasilCube = findViewById(R.id.cube_hasil);
        cubeCalculate = findViewById(R.id.cube_calculate);

        cubeCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sisiStr = sisiCube.getText().toString();

                if (!sisiStr.isEmpty()) {
                    double sisi = Double.parseDouble(sisiStr);
                    double hasil = sisi * sisi * sisi;
                    hasilCube.setText("Volume : " + hasil);
                } else {
                    Toast.makeText(Cube.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
