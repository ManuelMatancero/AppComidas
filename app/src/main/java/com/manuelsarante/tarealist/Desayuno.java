package com.manuelsarante.tarealist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Desayuno extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desayuno);
    }

    public void goAvena(View view) {
        MainActivity.dTipo = "avena";
        Intent i = new Intent(Desayuno.this, Lista.class);
        startActivity(i);
    }

    public void goHuevo(View view) {
        MainActivity.dTipo = "huevo";
        Intent i = new Intent(Desayuno.this, Lista.class);
        startActivity(i);
    }

    public void goPan(View view) {
        MainActivity.dTipo = "pan";
        Intent i = new Intent(Desayuno.this, Lista.class);
        startActivity(i);
    }

    public void goYogurt(View view) {
        MainActivity.dTipo = "yogurt";
        Intent i = new Intent(Desayuno.this, Lista.class);
        startActivity(i);
    }

    public void goFrutas(View view) {
        MainActivity.dTipo = "fruta";
        Intent i = new Intent(Desayuno.this, Lista.class);
        startActivity(i);
    }
}