package com.example.tugaspakaji.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugaspakaji.R;
import com.example.tugaspakaji.bangunDatar.Circle;
import com.example.tugaspakaji.bangunDatar.Kite;
import com.example.tugaspakaji.bangunDatar.Rectangle;
import com.example.tugaspakaji.bangunDatar.Rhombus;
import com.example.tugaspakaji.bangunDatar.Square;
import com.example.tugaspakaji.bangunDatar.Triangle;

public class Fragment1 extends Fragment {

    CardView persegi;
    CardView persegiPanjang;
    CardView lingkaran;
    CardView belahKetupat;
    CardView layangLayang;
    CardView segitiga;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1, container, false);
        persegi = view.findViewById(R.id.Persegi);
        persegiPanjang = view.findViewById(R.id.PersegiPanjang);
        lingkaran = view.findViewById(R.id.Lingkaran);
        belahKetupat = view.findViewById(R.id.BelahKetupat);
        layangLayang = view.findViewById(R.id.LayangLayang);
        segitiga = view.findViewById(R.id.Segitiga);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Square.class);
                startActivity(intent);
            }
        });

        persegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Rectangle.class);
                startActivity(intent);
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Circle.class);
                startActivity(intent);
            }
        });

        belahKetupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Rhombus.class);
                startActivity(intent);
            }
        });

        layangLayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(getActivity(), Kite.class);
                startActivity(intent);
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Triangle.class);
                startActivity(intent);
            }
        });

        return view;
    }
}