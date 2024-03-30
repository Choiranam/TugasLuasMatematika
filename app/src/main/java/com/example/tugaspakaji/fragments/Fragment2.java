package com.example.tugaspakaji.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.tugaspakaji.R;
import com.example.tugaspakaji.bangunDatar.Square;
import com.example.tugaspakaji.bangunRuang.Cone;
import com.example.tugaspakaji.bangunRuang.Cube;
import com.example.tugaspakaji.bangunRuang.Cylinder;
import com.example.tugaspakaji.bangunRuang.HexagonalPrism;
import com.example.tugaspakaji.bangunRuang.Sphere;
import com.example.tugaspakaji.bangunRuang.SquarePyramid;

public class Fragment2 extends Fragment {

    CardView kubus;
    CardView kerucut;
    CardView limasSegiempat;
    CardView prismaSegienam;
    CardView tabung;
    CardView bola;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment2, container, false);
        kubus = view.findViewById(R.id.Kubus);
        kerucut = view.findViewById(R.id.Kerucut);
        limasSegiempat = view.findViewById(R.id.LimasSegiempat);
        prismaSegienam = view.findViewById(R.id.PrismaSegienam);
        tabung = view.findViewById(R.id.Tabung);
        bola = view.findViewById(R.id.Bola);

        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cube.class);
                startActivity(intent);
            }
        });

        kerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cone.class);
                startActivity(intent);
            }
        });

        limasSegiempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SquarePyramid.class);
                startActivity(intent);
            }
        });

        prismaSegienam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HexagonalPrism.class);
                startActivity(intent);
            }
        });

        tabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cylinder.class);
                startActivity(intent);
            }
        });

        bola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sphere.class);
                startActivity(intent);
            }
        });

        return view;
    }
}