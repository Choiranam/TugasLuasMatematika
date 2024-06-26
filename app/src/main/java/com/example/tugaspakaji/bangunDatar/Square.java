package com.example.tugaspakaji.bangunDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugaspakaji.R;

public class Square extends AppCompatActivity {

    EditText sisiSquare;
    TextView hasilSquare;
    Button squareCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        sisiSquare = findViewById(R.id.square_sisi);
        hasilSquare = findViewById(R.id.square_hasil);
        squareCalculate = findViewById(R.id.square_calculate);

        squareCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sisiStr = sisiSquare.getText().toString();

                if (!sisiStr.isEmpty()) {
                    double sisi = Double.parseDouble(sisiStr);
                    double hasil = 0;
                    hasil = sisi * sisi;
                    hasilSquare.setText("Hasil : " + hasil);
                } else {
                    Toast.makeText(Square.this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}